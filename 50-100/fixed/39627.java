@cucumber.api.java.en.Then(value = "^the topology should not be valid$")
public void the_topology_should_not_be_valid() throws java.lang.Throwable {
    alien4cloud.rest.model.RestResponse<?> restResponse = alien4cloud.rest.utils.JsonUtil.read(alien4cloud.it.Context.getInstance().getRestResponse(), alien4cloud.it.Context.getJsonMapper());
    assertNotNull(restResponse.getData());
    java.util.Map<java.lang.String, java.lang.Object> dataMap = alien4cloud.rest.utils.JsonUtil.toMap(alien4cloud.rest.utils.JsonUtil.toString(restResponse.getData()));
    assertFalse(java.lang.Boolean.valueOf(dataMap.get("valid").toString()));
}