@java.lang.Override
public void onConfigured(@android.support.annotation.NonNull
android.hardware.camera2.CameraCaptureSession session) {
    onCaptureSessionConfigured(session, CameraDevice.TEMPLATE_PREVIEW);
}