private java.net.Socket createSocket(java.net.InetSocketAddress socketAddress) throws java.io.IOException {
    final java.net.Socket socket = new java.net.Socket();
    boolean success = false;
    try {
        socket.setSoTimeout(3000);
        socket.connect(socketAddress);
        success = true;
    } finally {
        if (!success) {
            com.navercorp.pinpoint.tools.utils.IOUtils.closeQuietly(socket);
        }
    }
    return socket;
}