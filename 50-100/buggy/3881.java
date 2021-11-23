public void centerMapOnLocation(android.location.Location location, java.lang.String title) {
    android.util.Log.i("Maps Activity", "Center on map - location");
    com.google.android.gms.maps.model.LatLng selectedLatLng = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
    com.androidandyuk.bikersbestfriend.MapsActivity.mMap.clear();
    if (title != "Your location") {
        com.androidandyuk.bikersbestfriend.MapsActivity.mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(selectedLatLng).title(title));
    }
    com.androidandyuk.bikersbestfriend.MapsActivity.mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(selectedLatLng, 14));
}