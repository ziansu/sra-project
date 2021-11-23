public synchronized void shutdown() {
    while (clientHandlerAdapter.isConnected()) {
        clientHandlerAdapter.shutdown();
    } 
    workerGroup.shutdownGracefully();
}