private void process(android.hardware.camera2.CaptureResult captureResult) {
    switch (mCaptureState) {
        case com.yorku.mstew.camera2videoimage.Camera2VideoImageActivity.STATE_PREVIEW :
            break;
        case com.yorku.mstew.camera2videoimage.Camera2VideoImageActivity.STATE_WAIT_LOCK :
            {
                mCaptureState = com.yorku.mstew.camera2videoimage.Camera2VideoImageActivity.STATE_PREVIEW;
                java.lang.Integer afState = captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if ((afState == (android.hardware.camera2.CaptureResult.CONTROL_AF_STATE_FOCUSED_LOCKED)) || (afState == (android.hardware.camera2.CaptureResult.CONTROL_AF_STATE_NOT_FOCUSED_LOCKED))) {
                    android.widget.Toast.makeText(getApplicationContext(), "Autofocus locked", Toast.LENGTH_SHORT).show();
                }
                startStillCaptureRequest();
                if (!(BooleanAutoFocusLock)) {
                }
            }
            break;
    }
}