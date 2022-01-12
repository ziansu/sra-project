private void initDrawingVal() {
    backCircleRect = new android.graphics.RectF(0, 0, mWidth, mHeight);
    mButtonRadius = (mHeight) / 2;
    if (mIsOpen) {
        mAlpha = 255;
        mButtonX = ((mWidth) - ((mButtonRadius) + (mButtonRadius))) + (mButtonRadius);
    }else {
        mAlpha = 0;
        mButtonX = mButtonRadius;
    }
}