public void onCameraViewStopped() {
    mGray.release();
    mRgba.release();
    repCount = 0;
}