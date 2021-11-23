@java.lang.Override
public javax.net.ssl.SSLSocket createSocket(java.lang.String host, int port, java.net.InetAddress localAddress, int localPort) throws java.io.IOException, java.net.UnknownHostException {
    javax.net.ssl.SSLSocket sslSocket = ((javax.net.ssl.SSLSocket) (delegate.createSocket(host, port, localAddress, localPort)));
    configureSocket(sslSocket);
    return sslSocket;
}