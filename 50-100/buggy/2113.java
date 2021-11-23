public boolean hasPermissions() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        android.util.Log.i("XXX", "Es mayor o igual a LOLIPOP");
        return ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA)) + (android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE))) != (android.content.pm.PackageManager.PERMISSION_GRANTED) ? false : true;
    }else {
        android.util.Log.i("XXX", "Es menor a LOLIPOP");
        return true;
    }
}