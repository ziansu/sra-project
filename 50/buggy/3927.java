public void verify(java.lang.String host, javax.net.ssl.SSLSocket ssl) throws java.io.IOException {
    hostnameverifier.verify(host, ssl.getSession());
}