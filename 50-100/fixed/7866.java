private void setMapPosition() {
    if ((googleMap) != null) {
        java.lang.System.out.println("googleMap != null");
        if (com.syzible.loinnir.utils.LocalStorage.getBooleanPref(LocalStorage.Pref.should_share_location, getActivity())) {
            getWebServerLocation();
        }else {
            googleMap.clear();
            googleMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(LocationService.ATHLONE, LocationService.INITIAL_LOCATION_ZOOM));
        }
    }
}