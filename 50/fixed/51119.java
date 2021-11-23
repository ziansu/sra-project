public void disconnect() {
    connected = false;
    if ((socket) != null) {
        socket.close();
        socket = null;
        java.lang.System.out.println("[TClient] Disconnected");
    }
}