private void start_camera() {
    try {
        android.hardware.Camera.CameraInfo currentCamInfo = new android.hardware.Camera.CameraInfo();
        int currentCameraId = com.marlin.tralp.Views.CapturaCameraView.mCameraId;
        camera = android.hardware.Camera.open(com.marlin.tralp.Views.CapturaCameraView.mCameraId);
    } catch (java.lang.RuntimeException e) {
        java.lang.System.out.println(("Error: " + e));
        return ;
    }
    if ((camera) != null) {
        mCameraViewLayout = new com.marlin.tralp.Views.CameraViewLayout(this, camera, com.marlin.tralp.Views.CapturaCameraView.mCameraId, this);
        android.widget.FrameLayout camera_view = ((android.widget.FrameLayout) (findViewById(R.id.CameraView)));
        camera_view.addView(mCameraViewLayout);
    }
}