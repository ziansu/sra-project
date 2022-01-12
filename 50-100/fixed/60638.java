@java.lang.Override
public void onDestroy() {
    if (((mLocationManager) != null) && ((mListener) != null)) {
        if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            mLocationManager.removeUpdates(mListener);
            mLocationManager = null;
            mListener = null;
        }
    }
}