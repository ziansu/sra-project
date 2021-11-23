public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    android.hardware.Camera.Parameters param = com.tetley.backgroundremover.view.CameraActivity.mCamera.getParameters();
    if (isChecked) {
        param.setFlashMode(Parameters.FLASH_MODE_ON);
    }else {
        param.setFlashMode(Parameters.FLASH_MODE_OFF);
    }
    com.tetley.backgroundremover.view.CameraActivity.mCamera.setParameters(param);
}