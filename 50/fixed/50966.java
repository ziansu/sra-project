@java.lang.Override
public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
    try {
        session.setRepeatingRequest(mCaptureRequestBuilder.build(), null, null);
    } catch (android.hardware.camera2.CameraAccessException e) {
        e.printStackTrace();
    }
}