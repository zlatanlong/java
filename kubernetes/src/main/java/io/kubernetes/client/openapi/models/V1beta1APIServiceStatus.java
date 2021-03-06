/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** APIServiceStatus contains derived information about an API server */
@ApiModel(description = "APIServiceStatus contains derived information about an API server")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-11-06T08:58:17.566Z[Etc/UTC]")
public class V1beta1APIServiceStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";

  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1beta1APIServiceCondition> conditions = null;

  public V1beta1APIServiceStatus conditions(List<V1beta1APIServiceCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public V1beta1APIServiceStatus addConditionsItem(V1beta1APIServiceCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1beta1APIServiceCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Current service state of apiService.
   *
   * @return conditions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current service state of apiService.")
  public List<V1beta1APIServiceCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1beta1APIServiceCondition> conditions) {
    this.conditions = conditions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1APIServiceStatus v1beta1APIServiceStatus = (V1beta1APIServiceStatus) o;
    return Objects.equals(this.conditions, v1beta1APIServiceStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1APIServiceStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
