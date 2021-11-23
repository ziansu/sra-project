@java.lang.Override
protected void processEvent(com.ctrip.hermes.metaserver.event.Event event) throws java.lang.Exception {
    m_brokerAssignmentHolder.clear();
    loadAndAddLeaderMetaWatcher(new com.ctrip.hermes.metaserver.event.impl.FollowerInitEventHandler.LeaderMetaChangedWatcher(event.getEventBus(), event.getVersion()), event.getVersion());
    loadAndAddMetaServerAssignmentWatcher(new com.ctrip.hermes.metaserver.event.impl.FollowerInitEventHandler.MetaServerAssignmentChangedWatcher(event.getEventBus(), event.getVersion()));
}