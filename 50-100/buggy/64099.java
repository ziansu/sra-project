public void drawMapWithRoute() {
    java.util.ArrayList<com.google.android.gms.maps.model.LatLng> coords = readCsv();
    com.google.android.gms.maps.model.PolylineOptions line = new com.google.android.gms.maps.model.PolylineOptions().width(10).color(Color.RED);
    line.addAll(coords);
    mMap.addPolyline(line);
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(coords.get(0), com.matthew.ceftrails.MapsActivity.ZOOMLEVEL));
}