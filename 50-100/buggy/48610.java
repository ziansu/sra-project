public void switchCamera(android.view.View view) {
    int oppositeCamera = org.geneanet.customcamera.ManagerCamera.determineOppositeCamera();
    initCameraResource(oppositeCamera);
    android.widget.FrameLayout cameraPreview = ((android.widget.FrameLayout) (findViewById(R.id.camera_preview)));
    cameraPreview.removeAllViews();
    org.geneanet.customcamera.CameraPreview myPreview = new org.geneanet.customcamera.CameraPreview(this, customCamera);
    cameraPreview.addView(myPreview);
    updateStateFlash(stateFlash);
}