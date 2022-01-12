private org.apache.http.client.methods.HttpPost buildRequest(org.jboss.dmr.ModelNode model) throws java.io.UnsupportedEncodingException {
    org.apache.http.client.methods.HttpPost request = new org.apache.http.client.methods.HttpPost(url);
    request.addHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.getMimeType());
    request.setEntity(new org.apache.http.entity.StringEntity(model.toJSONString(true)));
    return request;
}