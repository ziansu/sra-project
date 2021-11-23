private void setUpMapIfNeeded() {
    if ((com.mycompany.behear.MainActivity.mMap) != null) {
        return ;
    }
    com.mycompany.behear.MainActivity.mMap = ((com.google.android.gms.maps.SupportMapFragment) (getSupportFragmentManager().findFragmentById(R.id.map))).getMap();
    if ((com.mycompany.behear.MainActivity.mMap) == null) {
        return ;
    }
}