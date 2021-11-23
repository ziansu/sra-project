@org.junit.Test
public void fetchBytesFromTheResponse() throws java.lang.Exception {
    java.lang.Integer data = 123456;
    com.clouway.chita.HttpRequest request = com.clouway.chita.HttpRequest.httpRequest(new com.clouway.chita.TargetUrl(serverUrl, com.clouway.chita.HttpClientTest.serviceUrl)).post(data).as(com.clouway.chita.CustomTransport.class).build();
    com.clouway.chita.HttpResponse response = httpClient.execute(request);
    byte[] reply = response.readBytes();
    assertThat(reply, org.hamcrest.Matchers.is(org.hamcrest.CoreMatchers.equalTo(data.toString().getBytes())));
}