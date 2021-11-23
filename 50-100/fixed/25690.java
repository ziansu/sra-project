private void disconnect() {
    try {
        if ((listener) != null) {
            listener.terminate();
        }
        if ((clientSocket) != null) {
            clientSocket.close();
        }
    } catch (java.lang.Exception e) {
        logger.trace("Error attempting to disconnect from Squeeze Server", e);
        return ;
    } finally {
        clientSocket = null;
        listener = null;
    }
    players.clear();
    logger.trace("Squeeze Server connection stopped.");
}