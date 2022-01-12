@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    mMap = googleMap;
    com.google.android.gms.maps.model.LatLng parkingSpot = new com.google.android.gms.maps.model.LatLng(lastLat, lastLong);
    mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(parkingSpot).title("Parking Location"));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(parkingSpot));
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.zoomTo(10));
}