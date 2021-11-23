public void disconnect() {
    try {
        socket.close();
    } finally {
        this.state = org.jyre.ZrePeer.State.DISCONNECTED;
        this.socket = null;
        this.endpoint = null;
    }
}