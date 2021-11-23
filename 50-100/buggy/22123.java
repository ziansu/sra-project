private synchronized void drawLine(com.google.android.gms.maps.model.LatLng latlng) {
    com.google.android.gms.maps.model.LatLng currCoordinates = latlng;
    route = mMap.addPolyline(new com.google.android.gms.maps.model.PolylineOptions().geodesic(true).add(cbpos1989.com.offroadtracker.MapsActivity.prevCoordinates).add(currCoordinates));
    route.setColor(Color.RED);
    route.setWidth(5.0F);
    android.util.Log.i("Route Drawing", ((("Drawing from " + (cbpos1989.com.offroadtracker.MapsActivity.prevCoordinates)) + " to ") + currCoordinates));
    cbpos1989.com.offroadtracker.MapsActivity.prevCoordinates = currCoordinates;
}