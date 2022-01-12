@java.lang.Override
public synchronized void shutdown() {
    while (clientHandlerAdapter.isConnected()) {
        clientHandlerAdapter.shutdown();
        workerGroup.shutdownGracefully();
    } 
    while (((tunnelHandler) != null) && (tunnelHandler.isConnected())) {
        tunnelHandler.shutdown();
    } 
}