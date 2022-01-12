public io.netty.handler.codec.http.HttpRequest _copyHeaders(java.lang.String uri, io.netty.handler.codec.http.HttpMethod method) {
    final io.netty.handler.codec.http.HttpRequest newHeaders = new io.netty.handler.codec.http.DefaultHttpRequest(headers.protocolVersion(), method, uri);
    for (java.util.Map.Entry<java.lang.String, java.lang.String> header : headers.headers()) {
        newHeaders.headers().set(header.getKey(), header.getValue());
    }
    return newHeaders;
}