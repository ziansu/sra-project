private long averageGap() {
    if ((sum) == 0)
        return java.lang.Integer.MAX_VALUE;
    
    return (org.apache.cassandra.net.OutboundTcpConnection.TimeHorizonMovingAverageCoalescingStrategy.MEASURED_INTERVAL) / (sum);
}