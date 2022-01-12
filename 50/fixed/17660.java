@java.lang.Override
public javax.net.ssl.SSLSocket createSocket(java.lang.String host, int port) throws java.io.IOException, java.net.UnknownHostException {
    javax.net.ssl.SSLSocket sslSocket = ((javax.net.ssl.SSLSocket) (delegate.createSocket(host, port)));
    return configureSocket(sslSocket);
}