@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    com.google.android.gms.maps.model.MarkerOptions markerOptions = new com.google.android.gms.maps.model.MarkerOptions().position(latLng).icon(determineMarkerIcon());
    marker = googleMap.addMarker(markerOptions);
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (getChildFragmentManager().findFragmentById(R.id.detail_mapContainer)));
    if ((mapFragment != null) && ((mapFragment.getView()) != null)) {
        mapFragment.getView().setClickable(false);
    }
}