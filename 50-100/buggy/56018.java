public void addMarkers(java.lang.String layerKey) {
    java.util.List<com.jstakun.gms.android.landmarks.ExtendedLandmark> landmarks = lm.getLandmarkStoreLayer(layerKey);
    int count = 0;
    for (final com.jstakun.gms.android.landmarks.ExtendedLandmark landmark : landmarks) {
        if (addMarker(landmark)) {
            count++;
        }
    }
    if (count > 0) {
        mClusterManager.cluster();
    }
}