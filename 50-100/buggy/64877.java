public void onResume() {
    super.onResume();
    setUpMapIfNeeded();
    if ((camerePosition) != null) {
        map.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(camerePosition));
        camerePosition = null;
    }
    if ((map) != null) {
        performRequest(false);
    }
}