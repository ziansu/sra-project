@org.junit.Test
public void testLogin() throws java.lang.Exception {
    javax.ws.rs.core.Response res = rule.getJerseyTest().target("/session/login").request().accept(MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.json(creds));
    org.assertj.core.api.Assertions.assertThat(res.getStatusInfo().getStatusCode()).isBetween(200, 300);
    verify(bounswegroup3.resource.SessionResourceTest.userDao).getUserByEmail(anyString());
    verify(bounswegroup3.resource.SessionResourceTest.failedLoginDao).attemptsInLastFiveMinutes(anyLong());
}