private void requestCamera() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CAMERA)) {
        }else {
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.CAMERA }, MY_PERMISSIONS_REQUEST_ACCESS_CAMERA);
        }
    }else {
        startCamera();
    }
}