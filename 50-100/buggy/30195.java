private void initDrawingVal() {
    mWidth = ((int) ((mHeight) * 1.5));
    backCircleRect = new android.graphics.RectF(0, 0, mWidth, mHeight);
    mButtonRadius = (mHeight) / 2;
    if (mIsOpen) {
        mAlpha = 255;
        mButtonX = ((int) ((mHeight) * 1.5)) - (mButtonRadius);
    }else {
        mAlpha = 0;
        mButtonX = mButtonRadius;
    }
}