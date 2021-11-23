@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);
    mStartX = (w / 2) - (((((mBigRadius) * (mCount)) * 2) + ((mSpaceEach) * ((mCount) - 1))) / 2);
    mStartY = h / 2;
}