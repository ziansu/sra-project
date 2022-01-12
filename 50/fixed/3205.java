@java.lang.Override
public com.restfb.Response executePost(java.lang.String url, java.lang.String parameters) throws java.io.IOException {
    this.savedUrl = url;
    this.method = com.restfb.DefaultWebRequestor.HttpMethod.POST;
    this.parameters = parameters;
    return new com.restfb.Response(java.net.HttpURLConnection.HTTP_OK, url);
}