@org.junit.Test
public void getAllAccount() {
    javax.ws.rs.client.Entity<java.lang.String> someEntity = javax.ws.rs.client.Entity.entity("email, pass", MediaType.APPLICATION_JSON);
    javax.ws.rs.core.Response response = test.java.TestDirlididi.server.newRequest("/account").request().buildGet().invoke();
    org.junit.Assert.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
}