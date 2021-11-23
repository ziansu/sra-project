@java.lang.Override
public void onCameraChange(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
    mLatLong = cameraPosition.target;
    mMap.clear();
    try {
        android.location.Location mLocation = new android.location.Location("");
        mLocation.setLatitude(mLatLong.latitude);
        mLocation.setLongitude(mLatLong.longitude);
        callReverseGeoService(mLocation);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}