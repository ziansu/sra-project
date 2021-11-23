@org.junit.Test
public void testDeleteRoleSuccessful() {
    testCreateRoleSuccessful();
    javax.ws.rs.core.Response response = webTarget.path(((RESOURCE_PATH) + "/5")).request().delete();
    org.junit.Assert.assertEquals(200, response.getStatus());
}