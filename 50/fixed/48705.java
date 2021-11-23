public void initCallbacks() {
    mCameraManager.registerAvailabilityCallback(getCamAvailabilityCallback(), new android.os.Handler(mContext.getMainLooper()));
    mCamNoPreview.registerCameraListener(this);
}