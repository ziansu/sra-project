@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    mMap.setMyLocationEnabled(true);
    mMap.setOnCameraChangeListener(this);
    mFragment.setmMap(googleMap);
    android.util.Log.d("map check", "mapready");
}