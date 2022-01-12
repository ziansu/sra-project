@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mLatestLocationLatLng = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
    createCircleAroundPoint(mLatestLocationLatLng);
    com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(mLatestLocationLatLng, 10);
    mMap.animateCamera(cameraUpdate);
    locationManager.removeUpdates(this);
    createCircleAroundPoint(mLatestLocationLatLng);
    try {
        callWeatherAPI(getWeatherURL(mLatestLocationLatLng.latitude, mLatestLocationLatLng.longitude));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}