static java.lang.String toJava(java.lang.String openSslCipherSuite, java.lang.String protocol) {
    java.util.Map<java.lang.String, java.lang.String> p2j = io.netty.handler.ssl.CipherSuiteConverter.o2j.get(openSslCipherSuite);
    if (p2j == null) {
        p2j = io.netty.handler.ssl.CipherSuiteConverter.cacheFromOpenSsl(openSslCipherSuite);
        if (p2j == null) {
            return null;
        }
    }
    java.lang.String javaCipherSuite = p2j.get(protocol);
    if (javaCipherSuite == null) {
        javaCipherSuite = (protocol + '_') + (p2j.get(""));
    }
    return javaCipherSuite;
}