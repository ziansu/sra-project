@java.lang.Override
public void onConfigured(com.holenstudio.excamera2.CameraCaptureSession cameraCaptureSession) {
    if (null == (mCameraDevice)) {
        return ;
    }
    mCaptureSession = cameraCaptureSession;
    try {
        mPreviewRequestBuilder.set(CaptureRequest.CONTROL_MODE, CameraMetadata.CONTROL_MODE_AUTO);
        mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_MODE_CONTINUOUS_PICTURE);
        mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, CaptureRequest.CONTROL_AE_MODE_ON_AUTO_FLASH);
        mPreviewRequest = mPreviewRequestBuilder.build();
        mCaptureSession.setRepeatingRequest(mPreviewRequest, null, mBackgroundHandler);
    } catch (com.holenstudio.excamera2.CameraAccessException e) {
        e.printStackTrace();
    }
}