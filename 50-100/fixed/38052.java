@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    android.util.Log.d("map", "onMapReady called");
    mMap = googleMap;
    double[] ret = getGPS();
    com.google.android.gms.maps.model.LatLng currentLocation = new com.google.android.gms.maps.model.LatLng(ret[0], ret[1]);
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(currentLocation, ((float) (15.0))));
    drawBleats(true);
    mMap.setOnMarkerClickListener(this);
    mMap.setOnCameraChangeListener(this);
}