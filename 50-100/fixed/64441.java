public int addMarkers(java.lang.String layerKey) {
    java.util.List<com.jstakun.gms.android.landmarks.ExtendedLandmark> landmarks = com.jstakun.gms.android.landmarks.LandmarkManager.getInstance().getLandmarkStoreLayer(layerKey);
    int count = 0;
    for (final com.jstakun.gms.android.landmarks.ExtendedLandmark landmark : landmarks) {
        if (addMarker(landmark, false)) {
            count++;
        }
    }
    if (count > 0) {
        mClusterManager.cluster();
    }
    return count;
}