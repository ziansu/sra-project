@java.lang.Override
public void onPrecaptureRequired() {
    if ((mPreviewRequestBuilder) != null) {
        mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER_START);
        setState(com.google.android.cameraview.Camera2.PictureCaptureCallback.STATE_PRECAPTURE);
        try {
            if ((mCaptureSession) != null) {
                mCaptureSession.capture(mPreviewRequestBuilder.build(), this, null);
                mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER_IDLE);
            }
        } catch (android.hardware.camera2.CameraAccessException e) {
            android.util.Log.e(com.google.android.cameraview.Camera2.TAG, "Failed to run precapture sequence.", e);
        }
    }
}