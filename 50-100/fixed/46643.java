@java.lang.Override
public void run() {
    while (true) {
        it.unipr.netsec.server.Server.LOGGER.log(java.util.logging.Level.INFO, "Creating a new socket ...");
        java.net.Socket unsecureSocket;
        try {
            unsecureSocket = it.unipr.netsec.server.SocketUtil.connectToClientSocket(it.unipr.netsec.server.Server.UNSECURE_PORT_NUMBER);
            it.unipr.netsec.server.Server.LOGGER.log(java.util.logging.Level.INFO, "Creating a thread for a new client ...");
            addThread(unsecureSocket);
        } catch (java.io.IOException e) {
            it.unipr.netsec.server.Server.LOGGER.log(java.util.logging.Level.SEVERE, e.toString());
            return ;
        }
    } 
}