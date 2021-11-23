public void DrawPolyline(java.util.List<com.google.android.gms.maps.model.LatLng> listOfPoints) {
    com.google.android.gms.maps.model.PolylineOptions options = new com.google.android.gms.maps.model.PolylineOptions().width(12).color(android.graphics.Color.parseColor("#E57373")).geodesic(true);
    for (int z = 0; z < (listOfPoints.size()); z++) {
        com.google.android.gms.maps.model.LatLng point = listOfPoints.get(z);
        options.add(point);
    }
    mMap.addPolyline(options);
}