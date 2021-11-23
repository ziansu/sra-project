public void checkLocalPhonePermission(java.lang.String permission, int requestId) {
    if ((Build.VERSION.SDK_INT) >= 23) {
        int permissionFlag = android.support.v4.app.ActivityCompat.checkSelfPermission(this, permission);
        if (permissionFlag != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ permission }, requestId);
        }
    }
}