@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    googleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(latitude, longitude)).title("Your location"));
}