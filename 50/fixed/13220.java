private long epoch(long latestNanos) {
    return (latestNanos - (org.apache.cassandra.net.OutboundTcpConnection.TimeHorizonMovingAverageCoalescingStrategy.INTERVAL)) & (~((org.apache.cassandra.net.OutboundTcpConnection.TimeHorizonMovingAverageCoalescingStrategy.BUCKET_INTERVAL) - 1));
}