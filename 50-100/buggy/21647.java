public void run() {
    keepListening = true;
    try {
        while (keepListening) {
            connectionHandler.HandleConnection(serverSocket.accept());
        } 
    } catch (java.io.IOException e) {
        keepListening = false;
        java.lang.System.err.printf("An error ocurred while accepting a connection.");
    } finally {
        try {
            serverSocket.close();
        } catch (java.io.IOException e) {
            java.lang.System.err.printf("An error ocurred while closing a server socket.");
        }
    }
}