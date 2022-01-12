protected void deactivate() {
    try {
        if ((scheduler) != null) {
            scheduler.shutdown();
        }
        stopDiscoveryFuture();
        if (logger.isDebugEnabled()) {
            logger.debug("Deactivated ZMote discovery service.");
        }
    } catch (final java.lang.Exception e) {
        if (logger.isDebugEnabled()) {
            logger.debug("Ignored exception while deactivating ZMote discovery service.", e);
        }
    } finally {
        scheduler = null;
    }
}