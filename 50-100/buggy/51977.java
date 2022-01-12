protected void garbageCollectorCall() {
    super.garbageCollectorCall();
    if ((googleMap) != null) {
        googleMap.setOnMarkerClickListener(null);
        googleMap.setOnInfoWindowClickListener(null);
        googleMap.setOnMyLocationChangeListener(null);
        googleMap.setOnMarkerDragListener(null);
    }
    clearOnGlobalLayoutListener();
    mapFragment = null;
    googleMap = null;
    myLocation = null;
    updatePending = null;
    markerInfo = null;
}