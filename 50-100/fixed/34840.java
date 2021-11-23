private void lockFocus() {
    mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_TRIGGER_START);
    try {
        mCaptureCallback.setState(com.google.android.cameraview.Camera2.PictureCaptureCallback.STATE_LOCKING);
        mCaptureSession.capture(mPreviewRequestBuilder.build(), mCaptureCallback, null);
    } catch (android.hardware.camera2.CameraAccessException e) {
        android.util.Log.e(com.google.android.cameraview.Camera2.TAG, "Failed to lock focus.", e);
    } catch (java.lang.Exception e) {
        android.util.Log.e(com.google.android.cameraview.Camera2.TAG, "Failed to lock focus.", e);
    }
}