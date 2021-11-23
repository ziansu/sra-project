@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    double mLat = location.getLatitude();
    double mLon = location.getLongitude();
    com.google.android.gms.maps.model.LatLng currentLocation = new com.google.android.gms.maps.model.LatLng(mLat, mLon);
}