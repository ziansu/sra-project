public java.util.Map<java.lang.Long, org.voltcore.utils.Pair<java.lang.String, long[]>> getIOStats(final boolean interval) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    final com.google_voltpatches.common.collect.ImmutableMap<java.lang.Integer, org.voltcore.messaging.ForeignHost> fhosts = m_foreignHosts;
    java.util.ArrayList<org.voltcore.network.VoltNetworkPool.IOStatsIntf> picoNetworks = new java.util.ArrayList(fhosts.size());
    for (org.voltcore.messaging.ForeignHost fh : fhosts.values()) {
        picoNetworks.add(fh.m_network);
    }
    return m_network.getIOStats(interval, picoNetworks);
}