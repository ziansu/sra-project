protected org.elasticsearch.test.rest.client.http.HttpRequestBuilder requestWithCredentials(java.lang.String credentials) throws java.lang.Exception {
    return httpClient().path("/_status").addHeader("Authorization", ("Basic " + (org.elasticsearch.common.Base64.encodeBytes(credentials.getBytes()))));
}