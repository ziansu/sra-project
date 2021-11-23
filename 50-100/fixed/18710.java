@java.lang.Override
public com.flightstats.hub.spoke.Content get(java.lang.String channelName, com.flightstats.hub.spoke.ContentKey key) {
    java.lang.String path = getPath(channelName, key);
    com.flightstats.hub.metrics.Traces traces = com.flightstats.hub.metrics.ActiveTraces.getLocal();
    traces.add("SpokeContentDao.read");
    try {
        return spokeStore.get(path, key);
    } catch (java.lang.Exception e) {
        com.flightstats.hub.spoke.SpokeContentDao.logger.warn(("unable to get data: " + path), e);
        return null;
    } finally {
        traces.add("SpokeContentDao.read completed");
    }
}