@java.lang.Override
protected void onResume() {
    super.onResume();
    try {
        mCamera = android.hardware.Camera.open();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        android.widget.Toast.makeText(this, "启动照相机失败，请检查设备并打开权限", Toast.LENGTH_SHORT).show();
    }
    cameraCurrentlyLocked = defaultCameraId;
    mPreview.setCamera(mCamera);
    startFocus();
}