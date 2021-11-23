protected void askForPermissions() {
    if (((android.support.v4.app.ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
            requestPermissions(new java.lang.String[]{ android.Manifest.permission.ACCESS_COARSE_LOCATION , android.Manifest.permission.ACCESS_FINE_LOCATION , android.Manifest.permission.INTERNET }, 10);
        }
        return ;
    }
}