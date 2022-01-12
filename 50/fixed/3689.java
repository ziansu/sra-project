public void end() {
    run = false;
    try {
        new java.net.Socket("localhost", serverPort);
    } catch (java.io.IOException ioe) {
        org.pmw.tinylog.Logger.error("Error trying to stop the server: {}", ioe);
    }
}