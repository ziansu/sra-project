public boolean setFlashMode(@com.google.android.gms.samples.vision.barcodereader.ui.camera.CameraSource.FlashMode
java.lang.String mode) {
    synchronized(mCameraLock) {
        if (((mCamera) != null) && (mode != null)) {
            android.hardware.Camera.Parameters parameters = mCamera.getParameters();
            parameters.setFlashMode(mode);
            mCamera.setParameters(parameters);
            mFlashMode = mode;
            return true;
        }
        return false;
    }
}