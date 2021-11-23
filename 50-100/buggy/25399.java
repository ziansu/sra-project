@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    try {
        if ((camera) != null) {
            camera.stopPreview();
            camera.release();
            camera = null;
        }
        camera = android.hardware.Camera.open(Camera.CameraInfo.CAMERA_FACING_BACK);
        camera.setDisplayOrientation(90);
    } catch (java.lang.Exception e) {
        android.util.Log.e(com.bitsorific.findyourthings.activity.ViewItemActivity.TAG, "failed to open Camera");
        e.printStackTrace();
        return false;
    }
    return true;
}