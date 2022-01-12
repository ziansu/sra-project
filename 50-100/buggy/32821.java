@java.lang.Override
protected void onPause() {
    super.onPause();
    if (((checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((checkSelfPermission(Manifest.permission.CAMERA)) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        if (mLocationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            mLocationManager.removeUpdates(mLocationListener);
        }
    }
}