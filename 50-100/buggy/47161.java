@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
    map = googleMap;
    redrawLine();
    if ((android.os.Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            buildGoogleApiClient();
            map.setMyLocationEnabled(true);
        }
    }else {
        buildGoogleApiClient();
        map.setMyLocationEnabled(true);
    }
    map.getUiSettings().setScrollGesturesEnabled(false);
}