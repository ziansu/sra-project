@org.junit.Test
public void executeSimpleGet() throws java.lang.Exception {
    com.clouway.chita.HttpRequest request = com.clouway.chita.HttpRequest.httpRequest(new com.clouway.chita.TargetUrl(serverUrl, com.clouway.chita.HttpClientTest.serviceUrl)).build();
    com.clouway.chita.HttpResponse response = httpClient.execute(request);
    server.hasReceivedGetRequest();
    org.junit.Assert.assertThat(response.isSuccessful(), org.hamcrest.Matchers.is(org.hamcrest.CoreMatchers.equalTo(true)));
    org.junit.Assert.assertThat(response.code(), org.hamcrest.Matchers.is(org.hamcrest.CoreMatchers.equalTo(200)));
}