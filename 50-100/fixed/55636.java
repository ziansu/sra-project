protected void activate() {
    try {
        if ((scheduler) != null) {
            deactivate();
        }
        startDiscoveryFuture();
        startScan();
        if (logger.isDebugEnabled()) {
            logger.debug("Activated ZMote discovery service.");
        }
    } catch (final java.lang.RuntimeException e) {
        if (logger.isErrorEnabled()) {
            logger.error("Failed to activate ZMote discovery service!", e);
        }
        deactivate();
        throw e;
    }
}