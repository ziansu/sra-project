@org.junit.Test
public void fetchGenericType() throws java.io.IOException {
    com.clouway.chita.HttpRequest request = com.clouway.chita.HttpRequest.httpRequest(new com.clouway.chita.TargetUrl(serverUrl, com.clouway.chita.HttpClientTest.serviceUrl)).post(com.google.common.collect.Lists.newArrayList()).as(com.clouway.chita.CustomTransport.class).build();
    com.clouway.chita.HttpResponse response = httpClient.execute(request);
    java.util.List<java.lang.String> result = response.read(new com.google.inject.TypeLiteral<java.util.List<java.lang.String>>() {    }).as(com.clouway.chita.CustomTransport.class);
    assertThat(result.size(), org.hamcrest.Matchers.is(0));
}