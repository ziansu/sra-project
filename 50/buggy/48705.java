public void initCallbacks() {
    mCameraManager.registerAvailabilityCallback(getCamAvailabilityCallback(), new android.os.Handler(mContext.getMainLooper()));
    if ((mCamNoPreview) != null) {
        mCamNoPreview.registerCameraListener(this);
    }
}