void propagateConnectionDisconnected(io.gomint.jraknet.ServerConnection connection) {
    this.removeActiveConnection(connection);
    this.propagateEvent(new io.gomint.jraknet.SocketEvent(SocketEvent.Type.CONNECTION_DISCONNECTED, connection));
}