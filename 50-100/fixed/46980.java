private void setCameraParameters(int updateSet) {
    if ((updateSet & (com.android.camera.PhotoModule.UPDATE_PARAM_INITIALIZE)) != 0) {
        updateCameraParametersInitialize();
    }
    if ((updateSet & (com.android.camera.PhotoModule.UPDATE_PARAM_ZOOM)) != 0) {
        updateCameraParametersZoom();
    }
    if ((updateSet & (com.android.camera.PhotoModule.UPDATE_PARAM_PREFERENCE)) != 0) {
        updateCameraParametersPreference();
    }
    if ((mCameraDevice) != null) {
        mCameraDevice.applySettings(mCameraSettings);
    }
}