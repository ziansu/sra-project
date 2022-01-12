public static org.apache.drill.exec.store.indexr.ScanWrokProvider.Stat getStat(org.apache.drill.exec.store.indexr.IndexRStoragePlugin plugin, org.apache.drill.exec.store.indexr.IndexRScanSpec scanSpec, java.lang.String scanId, long limitScanRows, java.util.List<org.apache.drill.common.expression.SchemaPath> columns) {
    org.apache.drill.exec.store.indexr.ScanWrokProvider.CacheKey key = new org.apache.drill.exec.store.indexr.ScanWrokProvider.CacheKey(scanId, scanSpec, limitScanRows);
    try {
        return org.apache.drill.exec.store.indexr.ScanWrokProvider.statCache.get(key, new java.util.concurrent.Callable<org.apache.drill.exec.store.indexr.ScanWrokProvider.Stat>() {
            @java.lang.Override
            public org.apache.drill.exec.store.indexr.ScanWrokProvider.Stat call() throws java.lang.Exception {
                return org.apache.drill.exec.store.indexr.ScanWrokProvider.calStat(plugin, scanSpec, scanId, limitScanRows, columns);
            }
        });
    } catch (java.util.concurrent.ExecutionException e) {
        throw new java.lang.RuntimeException(e);
    }
}