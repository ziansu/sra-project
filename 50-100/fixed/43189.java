@java.lang.Override
protected com.meitu.camera.model.CameraConfig initFilterCameraConfig() {
    mCameraConfig = new com.meitu.camera.model.CameraConfig();
    mCameraConfig.mPreviewMode = CameraConfig.PREVIEW_MODE.GL_SURFACE_VIEW;
    mCameraConfig.mPreviewFrameLayoutResId = R.id.camera_previewframe_layout;
    mCameraConfig.mFocusLayoutResId = R.id.camera_focous_layout;
    mCameraConfig.mFaceLayoutResId = R.id.camera_faceview;
    mCameraConfig.mFlashMode = Camera.Parameters.FLASH_MODE_OFF;
    mCameraConfig.isDefaultStartFrontCamera = true;
    mCameraConfig.mPreviewLayout = CameraConfig.PREVIEW_LAYOUT.CROP;
    mCameraConfig.canStartPreviewInJpegCallback = false;
    mCameraConfig.isNeedAutoFocusBeforeTakePicture = true;
    mCommonCamearProcess = new com.meitu.camerademo.CameraFragment.CommonCameraProcess();
    mCameraConfig.mCameraProcess = mCommonCamearProcess;
    return mCameraConfig;
}