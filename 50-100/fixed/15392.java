protected void checkForPermissions() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        if (((checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) || ((checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
            requestPermissions(new java.lang.String[]{ Manifest.permission.READ_EXTERNAL_STORAGE , Manifest.permission.WRITE_EXTERNAL_STORAGE }, 5);
        }
    }
}