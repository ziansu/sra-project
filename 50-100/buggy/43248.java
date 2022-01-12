public boolean pingNodeWithPort() {
    try (java.net.Socket socket = new java.net.Socket()) {
        socket.connect(new java.net.InetSocketAddress(NodeIP, java.lang.Integer.parseInt(NodePort)), 3000);
        return true;
    } catch (java.io.IOException e) {
        return false;
    }
}