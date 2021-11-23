public java.util.Set<java.lang.String> getClusters() {
    acquireSharedLock();
    try {
        return java.util.Collections.unmodifiableSet(clustersToIndex);
    } finally {
        releaseSharedLock();
    }
}