private void askForPermission(java.lang.String permission, java.lang.Integer requestCode) {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, permission)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ permission }, requestCode);
        }else {
        }
    }else {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ permission }, requestCode);
    }
}