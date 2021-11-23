@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    android.util.Log.d(com.example.yeelin.projects.betweenus.fragment.BaseMapFragment.TAG, "onMapReady");
    map = googleMap;
    com.google.android.gms.maps.UiSettings mapUiSettings = map.getUiSettings();
    mapUiSettings.setMapToolbarEnabled(true);
    if (com.example.yeelin.projects.betweenus.BuildConfig.DEBUG) {
        mapUiSettings.setZoomControlsEnabled(true);
    }
    map.setMyLocationEnabled(true);
    map.setContentDescription(getString(R.string.map_contentDescription));
}