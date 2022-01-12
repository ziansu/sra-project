public void closeTCPSocket(java.net.Socket socket) {
    java.util.ArrayList<java.net.Socket> list = mTCPSockets.get(socket.getInetAddress().getHostAddress());
    list.remove(socket);
    try {
        socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    java.lang.System.err.println("close tcp socket");
}