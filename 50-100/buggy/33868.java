@cucumber.api.java.en.Then(value = "^The response should contain a user \"([^\"]*)\" not having \"([^\"]*)\" role$")
public void The_response_should_contain_a_user_not_having_role(java.lang.String username, java.lang.String expectedRole) throws java.lang.Throwable {
    alien4cloud.rest.model.RestResponse<alien4cloud.security.model.User> restResponse = alien4cloud.rest.utils.JsonUtil.read(alien4cloud.it.Context.getInstance().getRestResponse(), alien4cloud.security.model.User.class);
    alien4cloud.security.model.User user = restResponse.getData();
    org.junit.Assert.assertNotNull(user);
    org.junit.Assert.assertTrue((!(org.apache.commons.lang3.ArrayUtils.contains(user.getRoles(), expectedRole))));
}