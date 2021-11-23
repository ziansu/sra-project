public void stop() {
    server.shutdownNow();
    uiServer.shutdownNow();
    org.apache.lens.server.LensServices.get().stop();
}