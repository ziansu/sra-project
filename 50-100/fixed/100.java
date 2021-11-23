@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);
    mWidth = w;
    mHeight = h;
    mMaxCircleRadius = 0.15F * (mHeight);
    mMinCircleRadius = 0.15F * (mHeight);
    resetPoint();
}