@java.lang.Override
public final void setFlashlightMode(@android.support.annotation.Nullable
final de.jeisfeld.augendiagnoselib.activities.CameraActivity.FlashMode flashlightMode) {
    if (flashlightMode == null) {
        mCurrentAutoExposureMode = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE_OFF;
    }else {
        switch (flashlightMode) {
            case OFF :
                mCurrentFlashMode = android.hardware.camera2.CaptureRequest.FLASH_MODE_OFF;
                mCurrentAutoExposureMode = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE_ON;
                break;
            case ON :
                mCurrentFlashMode = android.hardware.camera2.CaptureRequest.FLASH_MODE_SINGLE;
                mCurrentAutoExposureMode = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE_ON_ALWAYS_FLASH;
                break;
            case TORCH :
                mCurrentFlashMode = android.hardware.camera2.CaptureRequest.FLASH_MODE_TORCH;
                mCurrentAutoExposureMode = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE_ON;
                break;
            default :
                mCurrentFlashMode = android.hardware.camera2.CaptureRequest.FLASH_MODE_OFF;
                mCurrentAutoExposureMode = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE_ON;
                break;
        }
    }
    if ((mCameraDevice) == null) {
        return ;
    }
    reconfigureCamera();
}