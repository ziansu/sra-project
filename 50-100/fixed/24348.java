private com.netflix.dyno.connectionpool.HostConnectionPool<CL> getHostPoolForOperationOrTokenInLocalZone(com.netflix.dyno.connectionpool.BaseOperation<CL, ?> op, java.lang.Long token) {
    com.netflix.dyno.connectionpool.HostConnectionPool<CL> hostPool;
    try {
        if (!(localSelector.isEmpty())) {
            hostPool = (op != null) ? localSelector.getPoolForOperation(op) : localSelector.getPoolForToken(token);
            if (isConnectionPoolActive(hostPool)) {
                return hostPool;
            }
        }
    } catch (com.netflix.dyno.connectionpool.exception.NoAvailableHostsException e) {
        cpMonitor.incOperationFailure(null, e);
    }
    return null;
}