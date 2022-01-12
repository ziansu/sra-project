boolean checkPermissions() {
    if ((Build.VERSION.SDK_INT) >= 23) {
        if ((((checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) && ((checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
            return true;
        }else {
            requestPermissions(new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION , Manifest.permission.READ_EXTERNAL_STORAGE , Manifest.permission.WRITE_EXTERNAL_STORAGE }, 1);
            return false;
        }
    }
    return true;
}