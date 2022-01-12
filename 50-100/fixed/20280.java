private void zoomToMarkers() {
    if (markers.isEmpty())
        return ;
    
    com.google.android.gms.maps.model.LatLngBounds.Builder b = new com.google.android.gms.maps.model.LatLngBounds.Builder();
    for (int i = 0; i < (this.markers.size()); i++) {
        b.include(this.markers.get(i).getPosition());
    }
    com.google.android.gms.maps.model.LatLngBounds bounds = b.build();
    int padding = 20;
    com.google.android.gms.maps.CameraUpdate cu = com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(bounds, padding);
    googleMap.animateCamera(cu);
}