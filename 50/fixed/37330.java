@java.lang.Override
protected void doProcess(org.apache.zookeeper.WatchedEvent event) {
    try {
        loadAndAddLeaderMetaWatcher(this);
    } catch (java.lang.Exception e) {
        com.ctrip.hermes.metaserver.event.impl.FollowerInitEventHandler.log.error("Exception occurred while handling leader meta watcher event.", e);
    }
}