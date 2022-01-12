static int getHealthyReplicationFactor(java.lang.String keyspace, int clusterSize) {
    if ("system_auth".equals(keyspace)) {
        return clusterSize;
    }
    if (clusterSize > 3) {
        return 3;
    }
    if (clusterSize >= 2) {
        return 2;
    }
    return 1;
}