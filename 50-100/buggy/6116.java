public void run() {
    try {
        javax.net.ssl.SSLSocket socket = com.booboot.vndbandroid.api.SocketPool.getSocket(socketIndex);
        if ((socket != null) && (!(socket.isClosed()))) {
            socket.getInputStream().close();
            socket.getOutputStream().close();
            socket.close();
        }
        com.booboot.vndbandroid.api.SocketPool.setSocket(socketIndex, null);
    } catch (java.io.IOException ioe) {
        ioe.printStackTrace();
    }
}