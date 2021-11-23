public static com.beatago.net.socket.SocketLink getInstence() {
    try {
        if ((com.beatago.net.socket.SocketLink.instence) == null) {
            com.beatago.net.socket.SocketLink.instence = new com.beatago.net.socket.SocketLink();
        }
    } catch (java.io.IOException e) {
        com.beatago.net.socket.SocketLink.instence = null;
        com.beatago.net.log.Log.logE(e.getMessage());
    }
    return com.beatago.net.socket.SocketLink.instence;
}