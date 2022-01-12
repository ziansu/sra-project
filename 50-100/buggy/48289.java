@java.lang.Override
public void stopListening() {
    if (((timedLocationTask) != null) && (runningStatus)) {
        context.unregisterReceiver(locationServiceStatusReceiver);
        if (((android.support.v4.content.ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.content.ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
            permissionDeniedHandler.onPermissionDenied(Manifest.permission.ACCESS_FINE_LOCATION);
            return ;
        }
        locationManager.removeUpdates(this);
    }
    runningStatus = false;
}