private void RequestAllPermissions() {
    java.lang.String[] permissions = new java.lang.String[]{ Manifest.permission.BLUETOOTH , Manifest.permission.BLUETOOTH_ADMIN , Manifest.permission.WRITE_EXTERNAL_STORAGE , Manifest.permission.READ_EXTERNAL_STORAGE , Manifest.permission.ACCESS_FINE_LOCATION , Manifest.permission.INTERNET , Manifest.permission.ACCESS_NETWORK_STATE , Manifest.permission.ACCESS_COARSE_LOCATION , Manifest.permission.READ_PHONE_STATE };
    boolean permissionRequestRequired = false;
    for (java.lang.String permission : permissions) {
        if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, permission)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            permissionRequestRequired = true;
        }
    }
    if (permissionRequestRequired) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, permissions, Global.PERMISSIONS_REQUEST);
    }else {
        InitializeAllTheThings();
    }
}