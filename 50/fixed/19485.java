private void getMapFragment() {
    if ((mapFragment) != null) {
        googleMap = mapFragment.getMap();
        if ((googleMap) != null) {
            googleMap.setMyLocationEnabled(true);
        }
    }
}