public void setVisibleXRange(float xRange) {
    float xScale = (mDeltaX) / xRange;
    mViewPortHandler.setMinimumScaleX(xScale);
}