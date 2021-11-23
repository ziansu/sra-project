private com.google.common.collect.Multimap<java.lang.String, java.lang.String> buildMap(com.appdynamics.extensions.io.Lines lines) {
    com.google.common.collect.Multimap<java.lang.String, java.lang.String> jkStatsMap = com.google.common.collect.ArrayListMultimap.create();
    for (java.lang.String line : lines) {
        java.lang.String[] kv = com.appdynamics.monitors.apache.ApacheStatusMonitor.EQUAL_SPLIT_PATTERN.split(line);
        if ((kv.length) == 2) {
            jkStatsMap.put(kv[0].trim(), kv[1].trim());
        }
    }
    return jkStatsMap;
}