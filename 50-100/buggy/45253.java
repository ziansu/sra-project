private java.lang.String Post(java.lang.String content) throws java.io.IOException {
    org.apache.http.impl.client.CloseableHttpClient httpclient = org.apache.http.impl.client.HttpClients.createDefault();
    org.apache.http.client.methods.HttpUriRequest login = org.apache.http.client.methods.RequestBuilder.post().setUri(this.url).setEntity(org.apache.http.client.entity.EntityBuilder.create().setText(content).build()).build();
    org.apache.http.client.methods.CloseableHttpResponse response = httpclient.execute(login);
    org.apache.http.HttpEntity entity = response.getEntity();
    httpclient.close();
    return org.apache.http.util.EntityUtils.toString(entity);
}