@java.lang.Override
public void completed(java.lang.Void result, java.nio.channels.AsynchronousSocketChannel channel) {
    isConnected = true;
    responseHandler.handle("CONNECTED", false);
    read(responseHandler);
}