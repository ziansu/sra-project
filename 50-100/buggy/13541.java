public void onMapLocationClicked(com.google.android.gms.maps.model.LatLng latLng) {
    android.util.Log.d(this.getLocalClassName(), ("on map location clicked " + latLng));
    getSupportFragmentManager().beginTransaction().show(discoverStreetViewFragment).addToBackStack("discover_street_view_fragment").commit();
    discoverStreetViewFragment.setLocation(latLng);
}