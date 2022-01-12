private void checkPermissions() {
    if ((Build.VERSION.SDK_INT) < 23)
        return ;
    
    if (((android.support.v4.content.ContextCompat.checkSelfPermission(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) || ((android.support.v4.content.ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        requestPermissions(new java.lang.String[]{ android.Manifest.permission.WRITE_EXTERNAL_STORAGE , android.Manifest.permission.CAMERA , android.Manifest.permission.ACCESS_FINE_LOCATION }, 0);
    }
}