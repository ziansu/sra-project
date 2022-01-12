static int getHealthyReplicationFactor(java.lang.String keyspace, int clusterSize) {
    if ("system_auth".equals(keyspace)) {
        return clusterSize;
    }
    if (clusterSize == 2) {
        return 2;
    }
    if (clusterSize > 2) {
        return 3;
    }
    return 1;
}