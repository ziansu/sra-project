public void setAutocompleteFragment() {
    if ((getFragment()) == null)
        return ;
    
    if ((getFragment().getChildFragmentManager()) == null)
        return ;
    
    autocompleteFragment = ((com.google.android.gms.location.places.ui.PlaceAutocompleteFragment) (getFragment().getChildFragmentManager().findFragmentById(R.id.place_autocomplete_fragment)));
    autocompleteFragment.setBoundsBias(new com.google.android.gms.maps.model.LatLngBounds(new com.google.android.gms.maps.model.LatLng(com.angular.gerardosuarez.carpoolingapp.mvp.view.MyMapView.LATITUDE_CALI_SECOND, com.angular.gerardosuarez.carpoolingapp.mvp.view.MyMapView.LONGITUDE_CALI_SECOND), new com.google.android.gms.maps.model.LatLng(com.angular.gerardosuarez.carpoolingapp.mvp.view.MyMapView.LATITUDE_CALI_FIRST, com.angular.gerardosuarez.carpoolingapp.mvp.view.MyMapView.LONGITUDE_CALI_FIRST)));
    autocompleteFragment.setOnPlaceSelectedListener(getFragment());
}