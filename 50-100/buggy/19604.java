@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap map) {
    this.myMap = map;
    if ((MainActivity.mLocation) != null) {
        com.google.android.gms.maps.model.LatLng sydney = new com.google.android.gms.maps.model.LatLng(MainActivity.mLocation.getLatitude(), MainActivity.mLocation.getLongitude());
        map.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(sydney));
    }
}