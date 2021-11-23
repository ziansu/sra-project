@org.junit.Test
public void serverReturnsBadRequestError() throws java.lang.Exception {
    com.clouway.chita.HttpClientTest.errorCode = 400;
    com.clouway.chita.HttpRequest request = com.clouway.chita.HttpRequest.httpRequest(new com.clouway.chita.TargetUrl(serverUrl, com.clouway.chita.HttpClientTest.errorServiceUrl)).build();
    com.clouway.chita.HttpResponse response = httpClient.execute(request);
    org.junit.Assert.assertThat(response.code(), org.hamcrest.Matchers.is(com.clouway.chita.HttpClientTest.errorCode));
}