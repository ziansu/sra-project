public void stop() {
    try {
        socket.close();
    } catch (final java.io.IOException e1) {
        de.taimos.gpsd4java.backend.GPSdEndpoint.LOG.debug(("Close forced: " + (e1.getMessage())));
    }
    try {
        this.listeners.clear();
        if ((listenThread) != null) {
            this.listenThread.halt();
        }
    } catch (final java.lang.Exception e) {
        de.taimos.gpsd4java.backend.GPSdEndpoint.LOG.debug("Interrupted while waiting for listenThread to stop", e);
    }
    this.listenThread = null;
}