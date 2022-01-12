private java.lang.String identifyRouting(java.lang.String hostAndPort, io.netty.handler.codec.http.HttpRequest httpRequest) {
    if (org.apache.commons.lang3.StringUtils.isBlank(hostAndPort)) {
        java.lang.String route = httpRequest.headers().get(HttpProxyHeaders.PROXY_ROUTE);
        if (org.apache.commons.lang3.StringUtils.isNotBlank(route)) {
            hostAndPort = (hostAndPort + ":") + route;
        }
    }
    return hostAndPort;
}