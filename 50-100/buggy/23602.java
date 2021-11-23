public void run() {
    this.conectionHandler = this.server.getConnectionHandlerFactory().create(this);
    this.conectionHandler.handleConnection(this.socket, this.getServerSocket());
    closeConnection();
    this.serverThread.sessionEnded(this);
}