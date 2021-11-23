@java.lang.Override
public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
    mRecordCaptureSession = session;
    try {
        mRecordCaptureSession.setRepeatingRequest(mCaptureRequestBuilder.build(), null, null);
    } catch (android.hardware.camera2.CameraAccessException e) {
        e.printStackTrace();
    }
}