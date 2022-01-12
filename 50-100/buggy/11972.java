public ATMServer.Server handleData() throws java.io.IOException {
    int i = 0;
    int maxConnections = 200;
    while ((i++) < maxConnections) {
        java.net.Socket clientConnection = s.accept();
        ATMServer.Worker worker = new ATMServer.Worker(clientConnection, functions, clientData);
        java.lang.Thread t = new java.lang.Thread(worker);
        t.start();
        logger.info(("New client connected, assigned thread ID #" + (t.getId())));
    } 
    return this;
}