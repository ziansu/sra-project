private org.springframework.web.client.RestTemplate getRestTemplate(java.lang.String ip, int port) {
    org.springframework.http.client.SimpleClientHttpRequestFactory factory = new org.springframework.http.client.SimpleClientHttpRequestFactory();
    java.net.InetSocketAddress address = new java.net.InetSocketAddress(ip, port);
    java.net.Proxy proxy = new java.net.Proxy(java.net.Proxy.Type.HTTP, address);
    factory.setProxy(proxy);
    return new org.springframework.web.client.RestTemplate(factory);
}