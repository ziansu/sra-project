@java.lang.Override
public java.net.Socket setSocket(java.net.ServerSocket serverSocket) {
    java.net.Socket fromserver = null;
    try {
        serverSocket.accept();
        com.shag.serverSim.server.tcp.ServerTCPImpl.LOGGER.log(java.util.logging.Level.INFO, "Client server socket has caught");
    } catch (java.io.IOException e) {
        com.shag.serverSim.server.tcp.ServerTCPImpl.LOGGER.log(java.util.logging.Level.WARNING, "Client server socket has not been caught");
        e.printStackTrace();
    }
    return fromserver;
}