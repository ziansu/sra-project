public void setInitialProgress(int progress) {
    if ((mProgressMode) != (ProgressView.MODE_DETERMINATE)) {
        throw new java.lang.IllegalStateException("Set progress is allowed only in determinate progress views");
    }
    mInitialAngle = ((progress * 360) / 100) % 360;
    if (mReverse) {
        mInitialAngle *= -1;
    }
    resetAnimation();
}