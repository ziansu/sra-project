@java.lang.Override
public void onMapClick(com.google.android.gms.maps.model.LatLng latLng) {
    activityConnector.dismissConfirmAddPoiWindow();
    if (poiAddingMode) {
        com.google.android.gms.maps.model.Marker marker = googleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(latLng));
        markerTarget = marker;
        googleMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(marker.getPosition(), com.blstream.as.map.MapsFragment.ZOOM), new com.blstream.as.map.MapsFragment.AnimateCameraCallbacks());
        marker.setDraggable(true);
        setPoiAddingMode(false);
    }
    if (!(inNavigationState)) {
        activityConnector.hidePoiPreview();
    }
}