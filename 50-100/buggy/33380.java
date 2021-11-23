private void requestPermissions(java.lang.String permission, int requestCode) {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, permission)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(this, permission)) {
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ permission }, requestCode);
            android.util.Log.d("permission", permission);
            takePhoto();
        }else {
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ permission }, requestCode);
        }
    }
}