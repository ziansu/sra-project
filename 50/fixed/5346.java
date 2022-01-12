@java.lang.Override
public void completed(java.nio.channels.AsynchronousSocketChannel result, java.lang.Void attachment) {
    this.handleNewlyAcceptedConnection(result);
    serverSocket.accept(null, this);
}