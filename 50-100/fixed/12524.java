@java.lang.Override
public int compare(com.vejkamera.RoadCamera lhsRoadCamera, com.vejkamera.RoadCamera rhsRoadCamera) {
    if (lhsRoadCamera == null) {
        return -1;
    }
    if (rhsRoadCamera == null) {
        return 1;
    }
    for (java.lang.String currentSyncId : originalSorting) {
        if (lhsRoadCamera.getSyncId().equals(currentSyncId)) {
            return -1;
        }
        if (rhsRoadCamera.getSyncId().equals(currentSyncId)) {
            return 1;
        }
    }
    return 0;
}