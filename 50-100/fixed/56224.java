private void createMarker() {
    if ((mapIsReady) && (fetchedData)) {
        for (com.cs492.gpsgame.MainActivity.Position pos : positionList) {
            com.google.android.gms.maps.model.Marker marker = googleMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(pos.latitude, pos.longitude)).title(pos.name));
            marker.setVisible(true);
            markerHashMap.put(pos.name, marker);
        }
    }
}