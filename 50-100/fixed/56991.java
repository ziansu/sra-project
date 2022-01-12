@org.androidannotations.annotations.AfterViews
protected void main() {
    mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (getSupportFragmentManager().findFragmentById(R.id.mapView)));
    mapFragment.getFragmentManager().getFragments();
    mapFragment.getMapAsync(this);
    com.google.android.gms.maps.model.MarkerOptions markerOptions = new com.google.android.gms.maps.model.MarkerOptions();
    markerOptions.draggable(true);
    locationManager = ((android.location.LocationManager) (getSystemService(com.example.a1.projecttest.LOCATION_SERVICE)));
}