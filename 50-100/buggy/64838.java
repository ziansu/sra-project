private void printJKStats(com.google.common.collect.Multimap<java.lang.String, java.lang.String> jkStatsMap, java.lang.String jkMetricPrefix, java.lang.String[] jkWorkerStats, java.util.List<java.lang.String> jkDeltaStats) {
    java.util.Set<java.lang.String> strings = jkStatsMap.keySet();
    for (java.lang.String key : strings) {
        if (key.contains("balance_workers")) {
            java.util.Collection<java.lang.String> workers = jkStatsMap.get(key);
            for (java.lang.String workerName : workers) {
                printJKWorkerMetrics(workerName, jkWorkerStats, jkStatsMap, jkMetricPrefix, jkDeltaStats);
            }
        }
    }
}