@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.map_location :
            if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
                mLocationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, this);
            }
            break;
    }
}