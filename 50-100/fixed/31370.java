@org.junit.Test
public void testUnsuccessfulLogin() throws java.lang.Exception {
    bounswegroup3.model.LoginCredentials tmp = new bounswegroup3.model.LoginCredentials("test", "nope");
    javax.ws.rs.core.Response res = rule.getJerseyTest().target("/session/login").request().accept(MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.json(tmp));
    org.assertj.core.api.Assertions.assertThat(res.getStatusInfo().getStatusCode()).isEqualTo(401);
}