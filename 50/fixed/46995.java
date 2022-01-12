@java.lang.Override
public void notLeader() {
    com.ctrip.hermes.metaserver.cluster.ClusterStateHolder.log.info("Become follower");
    m_hasLeadership.set(false);
    m_eventBusBootstrapListener.notLeader(this);
}