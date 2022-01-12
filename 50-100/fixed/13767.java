private org.apache.http.client.methods.CloseableHttpResponse postJson(java.net.URI url, net.sf.json.JSONObject json) throws java.io.IOException {
    org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost(url);
    httpPost.addHeader("Content-Type", "application/json");
    org.apache.http.entity.StringEntity input = new org.apache.http.entity.StringEntity(json.toString());
    httpPost.setEntity(input);
    return httpClient.execute(targetHost, httpPost, clientContext);
}