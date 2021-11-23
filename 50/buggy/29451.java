public boolean isConnected() {
    return (socket.isConnected()) && (!(socket.isClosed()));
}