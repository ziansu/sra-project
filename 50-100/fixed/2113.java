public boolean hasPermissions() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        return ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA)) + (android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE))) != (android.content.pm.PackageManager.PERMISSION_GRANTED) ? false : true;
    }else {
        return true;
    }
}