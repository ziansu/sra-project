private void updateLocation(com.google.android.gms.maps.model.LatLng location) {
    for (int i = 0; i < (models.size()); i++) {
        prada.lab.android.pingo.controller.FeedsAdapter.MyViewModel m = ((prada.lab.android.pingo.controller.FeedsAdapter.MyViewModel) (models.get(0)));
        m.mViewModel.setCurrentLocation(location);
    }
}