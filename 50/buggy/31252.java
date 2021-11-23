public void init(com.google.android.gms.maps.GoogleMap mMap) {
    marker = mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(userLoc).title("your current location"));
    userLocTmp = marker;
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(userLoc));
}