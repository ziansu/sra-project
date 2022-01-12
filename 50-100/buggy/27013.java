public com.orientechnologies.orient.core.index.OIndexAbstract<T> addCluster(final java.lang.String clusterName) {
    com.orientechnologies.orient.core.index.OIndexAbstract.acquireExclusiveLock();
    try {
        if (clustersToIndex.add(clusterName)) {
            updateConfiguration();
            indexCluster(clusterName, null, 0, 0, 0);
        }
        return this;
    } finally {
        com.orientechnologies.orient.core.index.OIndexAbstract.releaseExclusiveLock();
    }
}