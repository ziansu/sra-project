public javax.net.ssl.SSLEngine createServerTransportSSLEngine() throws javax.net.ssl.SSLException {
    if ((trustedTransportCertificates) == null) {
        throw new org.elasticsearch.ElasticsearchException("No truststore configured for server");
    }
    final io.netty.handler.ssl.SslContextBuilder sslContextBuilder = io.netty.handler.ssl.SslContextBuilder.forServer(transportKeystoreKey, transportKeystoreCert).ciphers(getEnabledSSLCiphers(this.sslTransportServerProvider)).applicationProtocolConfig(ApplicationProtocolConfig.DISABLED).clientAuth(ClientAuth.REQUIRE).sessionCacheSize(0).sessionTimeout(0).sslProvider(this.sslTransportServerProvider).trustManager(trustedTransportCertificates);
    final javax.net.ssl.SSLEngine engine = sslContextBuilder.build().newEngine(PooledByteBufAllocator.DEFAULT);
    return engine;
}