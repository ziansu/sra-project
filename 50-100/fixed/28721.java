private io.netty.handler.codec.http.DefaultHttpResponse toDefaultHttpResponse() {
    final io.netty.handler.codec.http.DefaultHttpResponse defaultHttpResponse = new io.netty.handler.codec.http.DefaultHttpResponse(httpVersion, status);
    final io.netty.handler.codec.http.HttpHeaders httpHeaders = defaultHttpResponse.headers().add(headers);
    for (io.netty.handler.codec.http.cookie.Cookie cookie : cookies) {
        httpHeaders.add(Names.SET_COOKIE, ServerCookieEncoder.LAX.encode(cookie));
    }
    return defaultHttpResponse;
}