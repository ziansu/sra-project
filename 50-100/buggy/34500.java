@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    try {
        mMap.setMyLocationEnabled(true);
        com.google.android.gms.maps.UiSettings mUISetting = mMap.getUiSettings();
        mUISetting.setMyLocationButtonEnabled(false);
        mMap.setMaxZoomPreference(20);
        mMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(latitude, longitude), 17));
        mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.zoomTo(18));
    } catch (java.lang.SecurityException ex) {
        android.util.Log.d("on map ready", "security issues");
    }
}