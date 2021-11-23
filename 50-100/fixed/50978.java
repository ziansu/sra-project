public void invalidate() {
    valid = false;
    try {
        unregisterMBean();
    } catch (java.lang.Exception e) {
        org.apache.cassandra.db.JVMStabilityInspector.inspectThrowable(e);
        org.apache.cassandra.db.ColumnFamilyStore.logger.warn("Failed unregistering mbean: {}", mbeanName, e);
    }
    latencyCalculator.cancel(false);
    org.apache.cassandra.db.SystemKeyspace.removeTruncationRecord(metadata.cfId);
    data.unreferenceSSTables();
    indexManager.invalidate();
    invalidateCaches();
}