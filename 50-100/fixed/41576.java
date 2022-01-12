private java.net.Socket createSocket(java.net.InetSocketAddress socketAddress) throws java.io.IOException {
    java.net.Socket socket = null;
    boolean success = false;
    try {
        socket = new java.net.Socket();
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