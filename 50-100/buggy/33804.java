private void updateDesiredPreviewSize() {
    if ((mCameraDevice) == null) {
        return ;
    }
    mCameraSettings = mCameraDevice.getSettings();
    android.graphics.Point desiredPreviewSize = com.android.camera.VideoModule.getDesiredPreviewSize(mAppController.getAndroidContext(), mCameraSettings, mCameraCapabilities, mProfile, mUI.getPreviewScreenSize());
    mDesiredPreviewWidth = desiredPreviewSize.x;
    mDesiredPreviewHeight = desiredPreviewSize.y;
    mUI.setPreviewSize(mDesiredPreviewWidth, mDesiredPreviewHeight);
    com.android.camera.debug.Log.v(com.android.camera.VideoModule.TAG, ((("Updated DesiredPreview=" + (mDesiredPreviewWidth)) + "x") + (mDesiredPreviewHeight)));
}