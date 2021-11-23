@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if ((mode_active) && ((mMyLocationOverlay.getMyLocation()) != null)) {
        mapView.getController().setCenter(mMyLocationOverlay.getMyLocation());
    }
}