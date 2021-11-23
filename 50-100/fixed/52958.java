public void startFlashLite() {
    try {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
            mCameraManager.setTorchMode(mCameraId, true);
        }else {
            com.maurya91.flashlight.MovementTrackerService.mCamera = android.hardware.Camera.open();
            android.hardware.Camera.Parameters parameters = com.maurya91.flashlight.MovementTrackerService.mCamera.getParameters();
            parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
            com.maurya91.flashlight.MovementTrackerService.mCamera.setParameters(parameters);
            com.maurya91.flashlight.MovementTrackerService.mCamera.startPreview();
            com.maurya91.flashlight.MovementTrackerService.mCamera.lock();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}