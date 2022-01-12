private void sendRequestPermission() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, REQUEST_PERMISSION_CODE);
        }else {
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, REQUEST_PERMISSION_CODE);
        }
    }
}