public void requestPermission() {
    if (((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) || ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE , Manifest.permission.CAMERA }, 3);
    }
}