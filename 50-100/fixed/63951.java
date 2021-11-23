@java.lang.Override
public void onLocationFoundLatLng(double lat, double lng) {
    if (isLocationFragment)
        switchFragment("", "add", "");
    
    com.lmos.spotter.MapsLayoutFragment mapsLayoutFragment = ((com.lmos.spotter.MapsLayoutFragment) (getSupportFragmentManager().findFragmentByTag("Map")));
    if (mapsLayoutFragment != null)
        mapsLayoutFragment.setUserPosition(new com.google.android.gms.maps.model.LatLng(lat, lng));
    
}