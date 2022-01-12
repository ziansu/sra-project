protected void activate() {
    try {
        if ((scheduler) != null) {
            deactivate();
        }
        scheduler = org.eclipse.smarthome.core.common.ThreadPoolManager.getScheduledPool(org.openhab.binding.zmote.internal.discovery.ZMoteDiscoveryService.class.getName());
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