public void setPermissions() {
    android.util.Log.i("XXX", "pasa por SetPermissions");
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.CAMERA , Manifest.permission.WRITE_EXTERNAL_STORAGE }, com.example.acedeno.customcamera.CustomCameraActivity.NOSCONECTA_CAMERA_PERMISSION);
    }
}