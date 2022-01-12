public void start() {
    log.debug("About to accept...");
    while (true) {
        final java.net.Socket sock;
        try {
            sock = serverSocket.accept();
        } catch (final java.io.IOException e) {
            log.warn("Exception on accept", e);
            continue;
        }
        time();
        copyFile(sock);
    } 
}