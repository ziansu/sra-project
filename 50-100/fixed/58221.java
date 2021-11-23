@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    this.googleMap = googleMap;
    this.googleMap.setMyLocationEnabled(true);
    this.googleMap.getUiSettings().isCompassEnabled();
    this.googleMap.getUiSettings().setZoomControlsEnabled(true);
    position = new com.google.android.gms.maps.model.LatLng(poi.getLatitudeValue(), poi.getLongitudeValue());
    zoom = 15;
    this.googleMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(position, zoom));
}