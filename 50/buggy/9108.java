public static com.spotify.reaper.cassandra.JmxProxy connect(java.lang.String host) throws com.spotify.reaper.ReaperException {
    return com.spotify.reaper.cassandra.JmxProxy.connect(com.google.common.base.Optional.<com.spotify.reaper.cassandra.RepairStatusHandler>absent(), host, com.spotify.reaper.cassandra.JmxProxy.JMX_PORT);
}