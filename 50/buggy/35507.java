public com.ctrip.hermes.core.bo.HostPort getLeader() {
    m_leader.compareAndSet(null, fetcheLeaderInfoFromZk());
    return m_leader.get();
}