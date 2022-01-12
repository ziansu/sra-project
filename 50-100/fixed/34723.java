public org.apache.http.client.methods.CloseableHttpResponse postJson(java.lang.String url, java.lang.String json, java.util.Map<java.lang.String, java.lang.String> reqHeaders) throws java.io.IOException {
    org.apache.http.impl.client.CloseableHttpClient req = getClient();
    org.apache.http.client.methods.CloseableHttpResponse resp = null;
    org.apache.http.client.methods.HttpPost post = new org.apache.http.client.methods.HttpPost(url);
    addHeaders(post, reqHeaders);
    org.apache.http.entity.StringEntity input = new org.apache.http.entity.StringEntity(json, org.apache.http.entity.ContentType.APPLICATION_JSON);
    post.setEntity(input);
    resp = req.execute(post);
    return resp;
}