@android.support.annotation.UiThread
final void animateCamera(com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap, com.mapbox.mapboxsdk.camera.CameraUpdate update, int durationMs, final com.mapbox.mapboxsdk.maps.MapboxMap.CancelableCallback callback) {
    com.mapbox.mapboxsdk.camera.CameraPosition cameraPosition = update.getCameraPosition(mapboxMap);
    if (!(cameraPosition.equals(this.cameraPosition))) {
        trackingSettings.resetTrackingModesIfRequired(cameraPosition);
        cancelTransitions();
        if (callback != null) {
            cameraCancelableCallback = callback;
            mapView.addOnMapChangedListener(this);
        }
        mapView.flyTo(cameraPosition.bearing, cameraPosition.target, durationMs, cameraPosition.tilt, cameraPosition.zoom);
    }
}