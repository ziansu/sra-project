@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((Build.VERSION.SDK_INT) >= 23) {
        if ((checkSelfPermission(Manifest.permission.CAMERA)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            requestPermissions(new java.lang.String[]{ Manifest.permission.CAMERA , Manifest.permission.WRITE_EXTERNAL_STORAGE }, 1);
        }else {
            resumeCamera();
        }
    }else {
        resumeCamera();
    }
}