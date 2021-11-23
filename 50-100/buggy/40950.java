@java.lang.Override
protected void onResume() {
    super.onResume();
    if (!(checkCameraHardware()))
        finish();
    
    if (com.vcelicky.smog.utils.SerializationUtils.serializedFileExists(this, Strings.SERIALIZED_LIST)) {
        com.vcelicky.smog.activities.CameraActivity.sPhotoList = ((java.util.ArrayList) (deserializeList()));
    }
    setContentView(R.layout.activity_camera);
    mCamera = com.vcelicky.smog.activities.CameraActivity.getCameraInstance();
    setPreviews();
    initListeners();
    checkNetworkStatus();
    requestLocationUpdate();
}