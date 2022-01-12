@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);
    mCenterX = w / 2.0F;
    mCenterY = h / 2.0F;
    mRadius = w / 2.0F;
    mLeft = 0 + (mBorderWidth);
    mTop = 0 + (mBorderWidth);
    mRight = w - (mBorderWidth);
    mBottom = h - (mBorderWidth);
}