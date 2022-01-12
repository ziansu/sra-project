public javax.net.ssl.SSLEngine createHTTPSSLEngine() throws javax.net.ssl.SSLException {
    final io.netty.handler.ssl.SslContextBuilder sslContextBuilder = io.netty.handler.ssl.SslContextBuilder.forServer(httpKeystoreKey, httpKeystoreCert).ciphers(getEnabledSSLCiphers()).applicationProtocolConfig(ApplicationProtocolConfig.DISABLED).clientAuth((enforceHTTPClientAuth ? io.netty.handler.ssl.ClientAuth.REQUIRE : io.netty.handler.ssl.ClientAuth.NONE)).sessionCacheSize(0).sessionTimeout(0).sslProvider(this.sslHTTPProvider);
    if (enforceHTTPClientAuth) {
        sslContextBuilder.trustManager(trustedHTTPCertificates);
    }
    javax.net.ssl.SSLEngine engine = sslContextBuilder.build().newEngine(PooledByteBufAllocator.DEFAULT);
    return engine;
}