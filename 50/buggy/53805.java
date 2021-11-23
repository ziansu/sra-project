@org.junit.Test
public void testHealthCheck() throws java.lang.Exception {
    org.elasticsearch.test.rest.client.http.HttpResponse response = com.asquera.elasticsearch.plugins.http.auth.integration.DefaultConfigurationIntegrationTest.httpClient().path("/").execute();
    assertThat(response.getStatusCode(), org.hamcrest.Matchers.equalTo(RestStatus.OK.getStatus()));
}