public void start() throws java.io.IOException {
    try {
        server.start();
    } catch (java.lang.Exception e) {
        throw new java.io.IOException("Unable to start Jetty server", e);
    }
}