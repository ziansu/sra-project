private synchronized void printAllEvents() {
    for (java.util.concurrent.ConcurrentHashMap<java.lang.String, org.openhab.io.caldav.CalDavEvent> map : this.eventCache.values()) {
        org.openhab.io.caldav.internal.CalDavLoaderImpl.LOG.trace((("------------ list " + (map.size())) + " -------------"));
        for (org.openhab.io.caldav.CalDavEvent event : map.values()) {
            org.openhab.io.caldav.internal.CalDavLoaderImpl.LOG.info(event.getShortName());
        }
        org.openhab.io.caldav.internal.CalDavLoaderImpl.LOG.trace("------------ list end ---------");
    }
}