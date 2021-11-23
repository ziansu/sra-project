@android.support.annotation.UiThread
final void moveCamera(com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap, com.mapbox.mapboxsdk.camera.CameraUpdate update, com.mapbox.mapboxsdk.maps.MapboxMap.CancelableCallback callback) {
    com.mapbox.mapboxsdk.camera.CameraPosition cameraPosition = update.getCameraPosition(mapboxMap);
    if (!(cameraPosition.equals(this.cameraPosition))) {
        trackingSettings.resetTrackingModesIfRequired(cameraPosition);
        cancelTransitions();
        mapView.jumpTo(cameraPosition.bearing, cameraPosition.target, cameraPosition.tilt, cameraPosition.zoom);
        if (callback != null) {
            callback.onFinish();
        }
    }
}