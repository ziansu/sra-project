@java.lang.Override
public void onMyLocationChange(android.location.Location location) {
    if (isRecenter) {
        isRecenter = false;
        com.amap.api.maps.AMap aMap = mapView.getMap();
        aMap.animateCamera(com.amap.api.maps.CameraUpdateFactory.newLatLng(new com.amap.api.maps.model.LatLng(location.getLatitude(), location.getLongitude())));
    }
}