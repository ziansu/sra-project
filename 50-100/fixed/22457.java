@java.lang.Override
public void centerOnLocation(@android.support.annotation.NonNull
android.location.Location location) {
    if ((map) != null) {
        final com.google.android.gms.maps.model.LatLng myPosition = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
        if (zoomIn) {
            map.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(myPosition, edu.hsb.wifivisualizer.map.GoogleMapService.INITAL_ZOOM_LEVEL));
            zoomIn = java.lang.Boolean.FALSE;
        }else {
        }
    }
}