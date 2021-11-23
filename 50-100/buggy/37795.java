private void stopListening() {
    try {
        if (((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
            return ;
        }
        if (((manager) != null) && ((listener) != null)) {
            manager.removeUpdates(listener);
        }
        manager = null;
    } catch (final java.lang.Exception e) {
        e.printStackTrace();
    }
}