@java.lang.Override
void setAutoFocusPoint(android.graphics.Point point) {
    if ((mAutoFocusPoint) == point) {
        return ;
    }
    mAutoFocusPoint = point;
    if ((mPreviewRequestBuilder) != null) {
        updateAutoFocusArea();
        if ((mCaptureSession) != null) {
            try {
                mCaptureSession.setRepeatingRequest(mPreviewRequestBuilder.build(), mCaptureCallback, null);
            } catch (android.hardware.camera2.CameraAccessException e) {
                mAutoFocus = !(mAutoFocus);
            }
        }
    }
}