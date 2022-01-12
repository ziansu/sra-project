private org.jboss.dmr.ModelNode parseResponse(org.apache.http.client.methods.CloseableHttpResponse response) throws java.io.IOException {
    org.jboss.dmr.ModelNode result;
    java.lang.String content = org.apache.http.util.EntityUtils.toString(response.getEntity());
    int status = response.getStatusLine().getStatusCode();
    if ((status == (org.apache.http.HttpStatus.SC_OK)) || (status == (org.apache.http.HttpStatus.SC_INTERNAL_SERVER_ERROR))) {
        result = org.jboss.dmr.ModelNode.fromJSONString(content);
    }else {
        throw new java.lang.RuntimeException(java.lang.String.format("Server responded %s%nMessage:%n%s", status, content));
    }
    return result;
}