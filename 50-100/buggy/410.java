public void captureImage() {
    android.widget.Toast.makeText(this, "And this is where the picture would be captured, If I could", Toast.LENGTH_SHORT).show();
    int checkPermission = android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
    if (checkPermission == (android.content.pm.PackageManager.PERMISSION_DENIED)) {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
            requestPermissions(new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, shuvalov.nikita.mirrormirror.MainActivity.STORAGE_PERMISSION_REQUEST);
        }
    }else {
        mCameraSource.takePicture(this, this);
    }
}