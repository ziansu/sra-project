public void disconnect() {
    try {
        log.info("Closing connection.");
        this.dc.close();
        log.info("Connection close.");
    } catch (java.io.IOException e) {
        log.error(e.getLocalizedMessage());
        log.error("Impossible to close connection.");
    }
}