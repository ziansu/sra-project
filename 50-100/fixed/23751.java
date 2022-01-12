public void moveCameraToMyLocation() {
    if ((googleMap) == null)
        return ;
    
    if (!(wasFirstLocationFig)) {
        com.appspace.appspacelibrary.util.LoggerUtils.log2D("moveCamera", "FirstLocationFig");
        wasFirstLocationFig = true;
        com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(mLocation.getLatitude(), mLocation.getLongitude());
        com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(latLng, 15);
        googleMap.animateCamera(cameraUpdate);
    }
}