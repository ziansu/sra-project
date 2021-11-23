public void _destroy() {
    try {
        org.atmosphere.cpr.Broadcaster b = getBroadcaster();
        if (!(isCancelled.get())) {
            removeFromAllBroadcasters();
        }
        broadcasters.clear();
        broadcasters.add(b);
        unregister();
        removeEventListeners();
    } catch (java.lang.Throwable t) {
        org.atmosphere.cpr.AtmosphereResourceImpl.logger.trace("destroyResource", t);
    } finally {
        unregister();
        webSocket = null;
    }
}