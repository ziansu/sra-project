private void moveCamera(final com.mapbox.mapboxsdk.geometry.LatLng position, final int animationLength) {
    if (position != null) {
        com.mapbox.mapboxsdk.camera.CameraPosition cameraPosition = new com.mapbox.mapboxsdk.camera.CameraPosition.Builder().target(position).zoom(currentZoom).build();
        if (animationLength >= 0) {
            mapboxMap.animateCamera(com.mapbox.mapboxsdk.camera.CameraUpdateFactory.newCameraPosition(cameraPosition), animationLength);
        }else {
            mapboxMap.animateCamera(com.mapbox.mapboxsdk.camera.CameraUpdateFactory.newCameraPosition(cameraPosition));
        }
    }
}