private void virtualDisplay() {
    if (null != (mMediaProjection)) {
        mVirtualDisplay = mMediaProjection.createVirtualDisplay("MainScreen", ((mScreenWidth) / 2), ((mScreenHeight) / 2), mScreenDensity, DisplayManager.VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR, mediaRecorder.getSurface(), null, null);
    }else {
        throw new java.lang.NullPointerException("mMediaProjection is null pointer");
    }
}