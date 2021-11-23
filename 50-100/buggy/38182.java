public boolean isStoragePermissionGranted() {
    if ((Build.VERSION.SDK_INT) >= 23) {
        if ((checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            isGranted = true;
            android.util.Log.v(MuzieApp.TAG, "Permission is granted");
            return true;
        }else {
            android.util.Log.v(MuzieApp.TAG, "Permission is revoked");
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, 1);
            return false;
        }
    }else {
        android.util.Log.v(MuzieApp.TAG, "Permission is granted");
        return true;
    }
}