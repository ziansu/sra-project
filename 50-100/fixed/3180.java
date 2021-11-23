public void _destroy() {
    try {
        if (!(isCancelled.get())) {
            removeFromAllBroadcasters();
        }
        broadcasters.clear();
        unregister();
        removeEventListeners();
    } catch (java.lang.Throwable t) {
        org.atmosphere.cpr.AtmosphereResourceImpl.logger.trace("destroyResource", t);
    } finally {
        unregister();
        webSocket = null;
    }
}