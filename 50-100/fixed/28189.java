private void setUpMap(com.google.android.gms.maps.model.LatLng latLng, java.lang.String country) {
    mMap.setInfoWindowAdapter(new com.thracecodeinc.myapp.CustomInfoWindowForMarker(this, country, filenameOld));
    mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(latLng).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))).showInfoWindow();
}