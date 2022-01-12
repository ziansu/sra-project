@java.lang.Override
public boolean requestPermission() {
    if (!(checkPermission())) {
        if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            new com.afollestad.materialdialogs.MaterialDialog.Builder(this).title("No write file permission").content("Can't export result").canceledOnTouchOutside(true).show();
            toggleExportFeature();
            return false;
        }else {
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, com.kamontat.checkidnumber.view.MainActivity.PERMISSION_CODE);
            toggleExportFeature();
            return true;
        }
    }
    return true;
}