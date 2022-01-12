public ATMServer.Server handleData() throws java.io.IOException {
    java.net.Socket clientConnection;
    int i = 0;
    int maxConnections = 200;
    while ((i++) < maxConnections) {
        clientConnection = s.accept();
        ATMServer.Worker worker = new ATMServer.Worker(clientConnection, functions, clientData);
        java.lang.Thread t = new java.lang.Thread(worker);
        t.run();
        logger.debug(("New client connected, assigned thread ID #" + (t.getId())));
    } 
    return this;
}