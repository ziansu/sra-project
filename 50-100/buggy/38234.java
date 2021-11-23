private void setUpVirtualDisplay() {
    int height = (mSurfaceView.getHeight()) - 20;
    int width = mSurfaceView.getWidth();
    com.example.android.common.logger.Log.i(com.example.android.screencapture.ScreenCaptureFragment.TAG, (((((("Setting up a VirtualDisplay: " + width) + "x") + height) + " (") + (mScreenDensity)) + ")"));
    mVirtualDisplay = mMediaProjection.createVirtualDisplay("ScreenCapture", width, height, mScreenDensity, DisplayManager.VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR, mSurface, null, null);
    mButtonToggle.setText(R.string.stop);
}