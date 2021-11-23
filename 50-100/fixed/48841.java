private void setLocation() {
    map.setCameraPosition(new com.mapbox.mapboxsdk.camera.CameraPosition.Builder().target(new com.mapbox.mapboxsdk.geometry.LatLng(locationServices.getLastLocation())).zoom(16).build());
    map.addMarker(new com.mapbox.mapboxsdk.annotations.MarkerOptions().position(new com.mapbox.mapboxsdk.geometry.LatLng(locationServices.getLastLocation())).title("Hello World!").snippet("Welcome to my marker."));
}