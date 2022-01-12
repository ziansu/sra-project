@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    currentLocation = location;
    centerOnMapPosition(new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude()));
    updateDisplayedTags();
}