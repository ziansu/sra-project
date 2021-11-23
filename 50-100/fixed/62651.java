public boolean shouldWatch(java.io.File directory) {
    final boolean result = ((rootSubset.isInRootsOrAncestorOrAnyRoot(directory)) || (org.gradle.internal.filewatch.jdk7.WatchPointsRegistry.isAncestorOfAnyRoot(directory, allRequestedRoots, true))) && (!(currentWatchPoints.contains(directory)));
    if ((!result) && (org.gradle.internal.filewatch.jdk7.WatchPointsRegistry.LOG.isDebugEnabled())) {
        org.gradle.internal.filewatch.jdk7.WatchPointsRegistry.LOG.debug("not watching directory: {} currentWatchPoints: {} allRequestedRoots: {} roots: {} unfiltered: {}", directory, currentWatchPoints, allRequestedRoots, rootSubset.roots, rootSubset.combinedFileSystemSubset);
    }
    return result;
}