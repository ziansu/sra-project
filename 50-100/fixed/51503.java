public <T> T request(java.lang.String uri, java.lang.Class<T> responseClass) throws java.io.IOException {
    org.apache.commons.httpclient.HttpMethod method = execute(uri);
    java.lang.String body = org.apache.commons.io.IOUtils.toString(method.getResponseBodyAsStream());
    return jsonizer.from(body, responseClass);
}