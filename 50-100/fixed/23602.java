public void run() {
    this.conectionHandler = this.server.getConnectionHandlerFactory().create(this);
    this.conectionHandler.handleConnection(this.socket, this.getServerSocket());
    this.closeConnection();
    this.serverThread.sessionEnded(this);
}