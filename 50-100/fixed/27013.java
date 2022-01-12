public com.orientechnologies.orient.core.index.OIndexAbstract<T> addCluster(final java.lang.String clusterName) {
    acquireExclusiveLock();
    try {
        if (clustersToIndex.add(clusterName)) {
            updateConfiguration();
            indexCluster(clusterName, null, 0, 0, 0);
        }
        return this;
    } finally {
        releaseExclusiveLock();
    }
}