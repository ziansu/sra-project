protected void deactivate() {
    try {
        stopDiscoveryFuture();
        if (logger.isDebugEnabled()) {
            logger.debug("Deactivated ZMote discovery service.");
        }
    } catch (final java.lang.Exception e) {
        if (logger.isDebugEnabled()) {
            logger.debug("Ignored exception while deactivating ZMote discovery service.", e);
        }
    }
}