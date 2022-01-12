protected java.lang.String sendRequest(java.net.URL resource) throws java.lang.Exception {
    final java.lang.String json = com.google.common.io.Resources.toString(resource, com.google.common.base.Charsets.UTF_8);
    com.google.api.client.http.HttpContent content = com.google.api.client.http.ByteArrayContent.fromString("application/json", json);
    com.google.api.client.http.HttpRequest request = requestFactory.buildPostRequest(url, content);
    com.google.api.client.http.HttpResponse response = request.execute();
    return com.google.common.io.CharStreams.toString(new java.io.InputStreamReader(response.getContent()));
}