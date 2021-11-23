@org.junit.Test
public void shouldNotPersistWhenSetToFalse() {
    setServeEvents(com.github.masonm.wiremock.SnapshotTaskTest.serveEvent(com.github.tomakehurst.wiremock.matching.MockRequest.mockRequest(), com.github.tomakehurst.wiremock.http.Response.response(), true));
    setReturnForCountRequestsMatching(1);
    com.toomuchcoding.jsonassert.JsonAssertion.assertThat(executeWithoutPersist()).hasSize(1).arrayField().matches("[a-z0-9\\-]{36}");
}