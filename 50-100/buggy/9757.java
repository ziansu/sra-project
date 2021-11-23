public synchronized void handleRecv(long latency) {
    (recvCountInterval)++;
    (recvCountTotal)++;
    if (latency > 0) {
        minLatency = java.lang.Math.min(minLatency, latency);
        maxLatency = java.lang.Math.max(maxLatency, latency);
        cumulativeLatencyInterval += latency;
        cumulativeLatencyTotal += latency;
        (latencyCountInterval)++;
        (latencyCountTotal)++;
    }
    report(false);
}