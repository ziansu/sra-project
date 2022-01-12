private void setLocation() {
    android.location.Location lastLocation1 = com.mapzen.android.lost.api.LocationServices.FusedLocationApi.getLastLocation();
    android.location.Location lastLocation = locationServices.getLastLocation();
    map.setCameraPosition(new com.mapbox.mapboxsdk.camera.CameraPosition.Builder().target(new com.mapbox.mapboxsdk.geometry.LatLng(lastLocation)).zoom(16).build());
    map.addMarker(new com.mapbox.mapboxsdk.annotations.MarkerOptions().position(new com.mapbox.mapboxsdk.geometry.LatLng(lastLocation)).title("Hello World!").snippet("Welcome to my marker."));
}