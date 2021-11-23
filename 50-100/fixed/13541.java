public void onMapLocationClicked(com.google.android.gms.maps.model.LatLng latLng) {
    android.util.Log.d(this.getLocalClassName(), ("on map location clicked " + latLng));
    getSupportFragmentManager().beginTransaction().show(discoverStreetViewFragment).commit();
    discoverStreetViewFragment.setLocation(latLng);
}