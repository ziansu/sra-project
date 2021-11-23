public boolean isConnected() {
    return (((socket) != null) && (!(socket.isClosed()))) && (socket.isConnected());
}