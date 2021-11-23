@java.lang.Override
public synchronized void shutdown() {
    while (clientHandlerAdapter.isConnected()) {
        clientHandlerAdapter.shutdown();
        workerGroup.shutdownGracefully();
    } 
    for (com.yumcouver.tunnel.client.tunnel.TunnelHandler tunnelHandler : com.yumcouver.tunnel.client.controller.ControllerClientHandler.tunnelHandlers) {
        while (tunnelHandler.isConnected())
            tunnelHandler.shutdown();
        
    }
}