@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    synchronized(this.mapLock) {
        this.map = googleMap;
        this.mapLock.notifyAll();
    }
    this.map.setMyLocationEnabled(((this.hasFineLocation) && ((this.lastKnownLocation) != null)));
    this.map.setBuildingsEnabled(true);
    this.map.getUiSettings().setMapToolbarEnabled(false);
    this.map.getUiSettings().setMyLocationButtonEnabled(true);
    this.map.setOnMarkerClickListener(this);
}