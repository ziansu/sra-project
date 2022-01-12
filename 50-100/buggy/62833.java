public static void TestLogin() {
    javax.ws.rs.client.Entity<java.lang.String> someEntity = javax.ws.rs.client.Entity.entity("login, pass", MediaType.APPLICATION_JSON);
    javax.ws.rs.core.Response response = test.java.TestDirlididi.server.newRequest("/login").request().buildPost(someEntity).invoke();
    org.junit.Assert.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
}