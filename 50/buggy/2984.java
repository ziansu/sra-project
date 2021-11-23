private com.mapbox.mapboxsdk.geometry.LatLng getLatLng(final android.location.Location location) {
    return new com.mapbox.mapboxsdk.geometry.LatLng(location.getLatitude(), location.getLongitude());
}