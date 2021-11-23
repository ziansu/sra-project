private long heartbeatPeriodMillis() {
    int callTimeoutMs = nodeEngine.getGroupProperties().getInteger(com.hazelcast.instance.GroupProperty.OPERATION_CALL_TIMEOUT_MILLIS);
    long periodMs = java.lang.Math.min(java.util.concurrent.TimeUnit.SECONDS.toMillis(1), (callTimeoutMs / (com.hazelcast.spi.impl.operationservice.impl.InvocationMonitor.HEARTBEAT_CALL_TIMEOUT_RATIO)));
    if (logger.isFinestEnabled()) {
        logger.finest((("Operation heartbeat period is " + periodMs) + " ms"));
    }
    return periodMs;
}