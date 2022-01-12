public void doDestroyCamera() {
    if (null != (mCamera)) {
        try {
            mSwitchView = null;
            mCamera.stopPreview();
            mCamera.setPreviewDisplay(null);
            mHolder = null;
            isPreviewing = false;
            mCamera.release();
            mCamera = null;
            android.util.Log.i(com.cjt2325.cameralibrary.CameraInterface.TAG, "=== Destroy Camera ===");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}