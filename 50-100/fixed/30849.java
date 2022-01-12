@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap gMap) {
    this.googleMap = gMap;
    com.google.android.gms.maps.model.BitmapDescriptor icon = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(R.drawable.esn_star);
    if (!(appState.getNationalPlatformInfo().getPlaces().isEmpty())) {
        com.google.android.gms.maps.model.LatLngBounds bounds = markLocationsAndComputeBounds(appState.getNationalPlatformInfo().getPlaces(), icon);
        int boundsPadding = 60;
        com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(bounds, boundsPadding);
        this.googleMap.moveCamera(cameraUpdate);
        this.googleMap.animateCamera(cameraUpdate);
    }
}