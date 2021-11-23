@java.lang.Override
public javax.net.ssl.SSLSocket createSocket(java.net.InetAddress host, int port) throws java.io.IOException {
    javax.net.ssl.SSLSocket sslSocket = ((javax.net.ssl.SSLSocket) (delegate.createSocket(host, port)));
    return configureSocket(sslSocket);
}