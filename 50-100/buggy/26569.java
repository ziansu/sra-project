private java.lang.String httpGet(org.apache.http.client.HttpClient httpClient, java.net.URI uri) throws java.io.IOException {
    org.apache.http.HttpEntity entity;
    org.apache.http.HttpResponse response = null;
    java.lang.String json = null;
    try {
        org.apache.http.client.methods.HttpGet getRequest = new org.apache.http.client.methods.HttpGet(uri);
        response = httpClient.execute(getRequest);
        checkStatusCode(response);
        entity = response.getEntity();
        json = org.apache.http.util.EntityUtils.toString(entity, "UTF-8");
        org.apache.http.util.EntityUtils.consume(entity);
    } finally {
        if (response != null) {
            org.apache.http.client.utils.HttpClientUtils.closeQuietly(response);
        }
    }
    return json;
}