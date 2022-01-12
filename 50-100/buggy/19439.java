private CycleDetectedException.TrackingInfo createTrackingInfo(com.github.jcomparison.core.exceptions.CycleDetectedException.TrackingInfo.GraphWithCycle bothGraphs, java.lang.Object leftFieldObject, java.lang.Object rightFieldObject, com.github.jcomparison.core.object.impl.VisitedObjectsCache recursionCache) {
    final java.util.List<java.lang.Object> trackOfLeftObjects = new java.util.ArrayList(recursionCache.visitedLeftObjects);
    final java.util.List<java.lang.Object> trackOfRightObjects = new java.util.ArrayList(recursionCache.visitedRightObjects);
    return new com.github.jcomparison.core.exceptions.CycleDetectedException.TrackingInfo(bothGraphs, leftFieldObject, rightFieldObject, trackOfLeftObjects, trackOfRightObjects);
}