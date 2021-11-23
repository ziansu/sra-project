@java.lang.Override
public io.undertow.protocols.alpn.OpenSSLAlpnProvider.OpenSSLALPNMethods run() {
    try {
        java.lang.Class<?> openSSLEngine = java.lang.Class.forName(io.undertow.protocols.alpn.OpenSSLAlpnProvider.OPENSSL_ENGINE, true, io.undertow.protocols.alpn.OpenSSLAlpnProvider.class.getClassLoader());
        java.lang.reflect.Method setApplicationProtocols = openSSLEngine.getMethod("setApplicationProtocols", java.lang.String[].class);
        java.lang.reflect.Method getApplicationProtocol = openSSLEngine.getMethod("getSelectedApplicationProtocol");
        UndertowLogger.ROOT_LOGGER.debug("OpenSSL ALPN Enabled");
        return new io.undertow.protocols.alpn.OpenSSLAlpnProvider.OpenSSLALPNMethods(setApplicationProtocols, getApplicationProtocol);
    } catch (java.lang.Exception e) {
        UndertowLogger.ROOT_LOGGER.debug("OpenSSL ALPN Enabled", e);
        return null;
    }
}