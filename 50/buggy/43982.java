@org.junit.After
public void deleteBrandResourceTest() {
    final javax.ws.rs.core.Response confirmationResponse = target().path("v1/brand/1").request().delete();
    org.junit.Assert.assertEquals(200, confirmationResponse.getStatus());
}