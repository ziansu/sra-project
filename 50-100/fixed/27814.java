@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);
    mStartX = ((w - (((mBigRadius) * 2) * (mCount))) - ((mSpaceEach) * ((mCount) - 1))) / 2;
    mStartY = h / 2;
}