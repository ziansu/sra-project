protected synchronized void initServerSocket() {
    try {
        serverSocket = openServerSocket();
    } catch (java.io.IOException e) {
        final java.lang.String msg = "Can not open server socket for " + (toString());
        log.error(msg, e);
        throw new java.lang.IllegalStateException(msg, e);
    }
    setRunning(true);
}