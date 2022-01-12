private void updateLocation() {
    if ((map) != null) {
        map.clear();
        com.google.android.gms.maps.model.CameraPosition cp = com.google.android.gms.maps.model.CameraPosition.builder().target(location).bearing(0).build();
        map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        map.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(location).title("Your Location"));
        map.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(cp));
    }
}