public void checkPerm() {
    boolean hasPermission = (android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED);
    if (!hasPermission) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, qwikstats.qwikcut.kerbysoft.com.qwikstats.MainActivity.REQUEST_WRITE_STORAGE);
    }
}