@org.junit.Test
public void fetchResponseContent() throws java.lang.Exception {
    java.lang.Integer data = 654321;
    com.clouway.chita.HttpRequest request = com.clouway.chita.HttpRequest.httpRequest(new com.clouway.chita.TargetUrl(serverUrl, com.clouway.chita.HttpClientTest.serviceUrl)).post(data).as(com.clouway.chita.CustomTransport.class).build();
    com.clouway.chita.HttpResponse response = httpClient.execute(request);
    assertThat(response.content(), org.hamcrest.Matchers.is(org.hamcrest.CoreMatchers.equalTo("654321")));
}