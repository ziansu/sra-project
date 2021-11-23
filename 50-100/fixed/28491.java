public void doStopCamera() {
    if (null != (mCamera)) {
        try {
            mCamera.stopPreview();
            mCamera.setPreviewDisplay(null);
            isPreviewing = false;
            mCamera.release();
            mCamera = null;
            android.util.Log.i(com.cjt2325.cameralibrary.CameraInterface.TAG, "=== Stop Camera ===");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}