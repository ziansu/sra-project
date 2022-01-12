@org.junit.Test
public void useBasicAuthorization() throws java.lang.Exception {
    com.clouway.chita.HttpRequest request = com.clouway.chita.HttpRequest.httpRequest(new com.clouway.chita.TargetUrl(serverUrl, com.clouway.chita.HttpClientTest.serviceUrl)).basicAuthorization("John", "pass123").post("").build();
    httpClient.execute(request);
    org.junit.Assert.assertThat(server.getRequestHeaders().get("Authorization").startsWith("Basic"), org.hamcrest.Matchers.is(true));
}