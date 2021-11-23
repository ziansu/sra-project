public void onResume() {
    super.onResume();
    if ((map) != null) {
        performRequest(false);
        if ((camerePosition) != null) {
            map.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(camerePosition));
            camerePosition = null;
        }
    }else {
        setUpMapIfNeeded();
    }
}