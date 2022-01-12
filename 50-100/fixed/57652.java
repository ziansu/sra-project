@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    this.googleMap = googleMap;
    com.google.android.gms.maps.model.LatLng sydney = new com.google.android.gms.maps.model.LatLng((-34), 151);
    this.googleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(sydney).title("Marker in Sydney"));
    this.googleMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(sydney));
}