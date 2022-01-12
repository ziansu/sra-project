@org.junit.Test
public void testHealthCheck() throws java.lang.Exception {
    org.elasticsearch.test.rest.client.http.HttpResponse response = httpClient().path("/").execute();
    assertThat(response.getStatusCode(), org.hamcrest.Matchers.equalTo(RestStatus.OK.getStatus()));
}