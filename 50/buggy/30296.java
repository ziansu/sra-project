private void plotNavigation(com.google.android.gms.maps.model.LatLng origin, com.google.android.gms.maps.model.LatLng destination) {
    com.prembros.artooproject.Directions directions = new com.prembros.artooproject.Directions(mMap);
    java.lang.String url = directions.getDirectionsUrl(origin, destination);
    directions.executeDownloadTask(url);
}