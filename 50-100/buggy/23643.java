public void onLocationChanged(android.location.Location location) {
    lng = location.getLongitude();
    lat = location.getLatitude();
    android.widget.Toast.makeText(this, ((("GPS: " + (lat)) + ", ") + (lng)), Toast.LENGTH_SHORT).show();
    com.google.android.gms.maps.model.LatLng myPos = new com.google.android.gms.maps.model.LatLng(lat, lng);
    com.matthew.ceftrails.RouteData.getInstance().addCoords(myPos);
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(myPos, com.matthew.ceftrails.MapsActivity.ZOOMLEVEL));
}