public void moveCameraToProvince(com.appspace.evyalert.model.Province province) {
    if ((googleMap) == null)
        return ;
    
    com.appspace.appspacelibrary.util.LoggerUtils.log2D("moveCamera", "moveCameraToProvince");
    wasFirstLocationFig = true;
    com.google.android.gms.maps.model.LatLngBounds provinceBound = new com.google.android.gms.maps.model.LatLngBounds(new com.google.android.gms.maps.model.LatLng(province.boundLatMin, province.boundLngMin), new com.google.android.gms.maps.model.LatLng(province.boundLatMax, province.boundLngMax));
    com.appspace.appspacelibrary.util.LoggerUtils.log2D("moveCamera", provinceBound.toString());
    com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(provinceBound, 100);
    googleMap.animateCamera(cameraUpdate);
}