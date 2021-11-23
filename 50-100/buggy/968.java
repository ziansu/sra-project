@cucumber.api.java.en.Then(value = "^The RestResponse should contain a topology id$")
public void The_RestResponse_should_contain_an_id_string() throws java.lang.Throwable {
    java.lang.String response = alien4cloud.it.Context.getInstance().getRestResponse();
    org.junit.Assert.assertNotNull(response);
    alien4cloud.rest.model.RestResponse<java.lang.String> restResponse = alien4cloud.rest.utils.JsonUtil.read(response, java.lang.String.class);
    org.junit.Assert.assertNotNull(restResponse.getData());
    org.junit.Assert.assertFalse(restResponse.getData().isEmpty());
}