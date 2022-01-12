public br.com.zup.push.client.ApnsHttp withProxy(br.com.zup.push.proxy.ProxyConfig proxyConfig) {
    final java.net.InetSocketAddress inetSocketAddress = new java.net.InetSocketAddress(proxyConfig.getAddress(), proxyConfig.getPort());
    br.com.zup.push.proxy.ProxyHandlerFactory proxyFactory = createProxyFactory(proxyConfig.getProtocol(), proxyConfig.getUsername(), proxyConfig.getPassword(), inetSocketAddress);
    this.httpClient.setProxyHandlerFactory(proxyFactory);
    return this;
}