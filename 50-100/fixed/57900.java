@java.lang.Override
public void onMapClick(@android.support.annotation.NonNull
com.mapbox.mapboxsdk.geometry.LatLng point) {
    android.util.Log.v("TAG", ("Current Location" + (point.getLatitude())));
    com.mapbox.mapboxsdk.geometry.LatLng latLng = new com.mapbox.mapboxsdk.geometry.LatLng(point.getLatitude(), point.getLongitude());
    mapboxMap.addMarker(new com.mapbox.mapboxsdk.annotations.MarkerOptions().position(point).title("You are here"));
}