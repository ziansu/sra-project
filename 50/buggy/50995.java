private boolean hasPermissions() {
    int permission = android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
    if (permission != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, com.mediaplayer.strings.activities.SplashScreenActivity.PERMISSIONS_STORAGE, com.mediaplayer.strings.activities.SplashScreenActivity.REQUEST_EXTERNAL_STORAGE);
        return false;
    }else {
        return true;
    }
}