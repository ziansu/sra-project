public void openCamera() {
    android.util.Log.i(com.cjt2325.cameralibrary.JCameraView.TAG, "openCamera: ");
    toOpenCamera = true;
    if (!(surfaceCreate)) {
        android.util.Log.i(com.cjt2325.cameralibrary.JCameraView.TAG, "openCamera surfaceCreate not ");
        return ;
    }
    android.util.Log.i(com.cjt2325.cameralibrary.JCameraView.TAG, "openCamera: ");
    surfaceCreate = false;
    new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            com.cjt2325.cameralibrary.CameraInterface.getInstance().doOpenCamera(com.cjt2325.cameralibrary.JCameraView.this);
        }
    }.start();
}