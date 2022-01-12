private void setUpMapIfNeeded() {
    if ((mMap) == null) {
        mMap = ((com.google.android.gms.maps.SupportMapFragment) (getSupportFragmentManager().findFragmentById(R.id.map))).getMap();
        if ((mMap) != null) {
            setUpMap();
        }
    }
}