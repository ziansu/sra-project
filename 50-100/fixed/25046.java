@org.junit.Test
public void returnsTwoMappingsForTwoServeEvents() {
    setServeEvents(com.github.masonm.wiremock.SnapshotTaskTest.serveEvent(com.github.tomakehurst.wiremock.matching.MockRequest.mockRequest(), com.github.tomakehurst.wiremock.http.Response.response(), true), com.github.masonm.wiremock.SnapshotTaskTest.serveEvent(com.github.tomakehurst.wiremock.matching.MockRequest.mockRequest().url("/foo"), com.github.tomakehurst.wiremock.http.Response.response(), true));
    setReturnForCountRequestsMatching(1);
    com.toomuchcoding.jsonassert.JsonAssertion.assertThat(executeWithoutPersist()).hasSize(2).arrayField();
}