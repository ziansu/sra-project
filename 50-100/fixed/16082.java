public void run() {
    try {
        org.atmosphere.cpr.BroadcasterFactory broadcasterFactory = resource.getAtmosphereConfig().getBroadcasterFactory();
        org.openhab.io.rest.internal.broadcaster.GeneralBroadcaster delayedBroadcaster = broadcasterFactory.lookup(org.openhab.io.rest.internal.broadcaster.GeneralBroadcaster.class, delayedBroadcasterName);
        if (delayedBroadcaster != null)
            delayedBroadcaster.broadcast(message, resource);
        
    } catch (java.lang.Exception e) {
        org.openhab.io.rest.internal.filter.PollingDelayFilter.logger.error("Could not broadcast message", e);
    }
}