public java.net.Socket getSocket() throws java.io.IOException {
    java.net.Socket socket = ((sslContext) == null) ? new java.net.Socket() : sslContext.getSocketFactory().createSocket();
    socket.setPerformancePreferences(2, 1, 0);
    socket.setTrafficClass(184);
    socket.setSoTimeout(soTimeout);
    socket.setKeepAlive(true);
    socket.setTcpNoDelay(true);
    socket.connect(new java.net.InetSocketAddress(address, port));
    io.pingpang.simpleexchangeproxyserver.Connector.totalConnection += 1;
    return socket;
}