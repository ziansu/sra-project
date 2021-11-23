public void disconnect() {
    if ((this.dc) != null)
        try {
            log.info("Closing connection.");
            this.dc.close();
            log.info("Connection close.");
        } catch (final java.io.IOException e) {
            log.error(e.getLocalizedMessage());
            log.error("Impossible to close connection.");
        }
    
}