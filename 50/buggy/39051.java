public void setVisibleXRange(float xRange) {
    float xScale = (mDeltaX) / (xRange + 0.01F);
    mViewPortHandler.setMinimumScaleX(xScale);
}