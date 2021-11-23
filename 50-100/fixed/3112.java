public void start() {
    try {
        doStart(resourceConfig);
        logger.info(java.lang.String.format("Application started with WADL available at %sapplication.wadl", getBaseUri()));
        if (config.isToOpenBrowser()) {
            java.net.URI baseUri = getBaseUri();
            java.awt.Desktop.getDesktop().browse(baseUri);
        }
        java.lang.Thread.currentThread().join();
    } catch (java.lang.Throwable e) {
        logger.error("Exception starting server", e);
        e.printStackTrace();
    }
}