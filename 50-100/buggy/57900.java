@java.lang.Override
public void onMapClick(@android.support.annotation.NonNull
com.mapbox.mapboxsdk.geometry.LatLng point) {
    android.util.Log.v("TAG", ("Current Location" + (point.getLatitude())));
    com.mapbox.mapboxsdk.geometry.LatLng latLng = new com.mapbox.mapboxsdk.geometry.LatLng(point.getLatitude(), point.getLongitude());
    com.mapbox.mapboxsdk.camera.CameraUpdate cameraUpdate = com.mapbox.mapboxsdk.camera.CameraUpdateFactory.newLatLngZoom(latLng, 22);
    mapboxMap.animateCamera(cameraUpdate);
    mapboxMap.addMarker(new com.mapbox.mapboxsdk.annotations.MarkerOptions().position(point).title("You are here"));
}