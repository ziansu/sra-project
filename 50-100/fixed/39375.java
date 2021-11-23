public android.graphics.Bitmap blur(int radius) {
    this.mRadius = radius;
    if ((mOriginalBitmap) == null)
        return null;
    
    if (((mLastRadius) == radius) && ((mBlurredBitmap) != null)) {
        this.mLastRadius = radius;
        return mBlurredBitmap;
    }
    this.mLastRadius = radius;
    if ((mBlurredBitmap) != null)
        mBlurredBitmap.recycle();
    
    mBlurredBitmap = mBlurAlgorithm.blur(mOriginalBitmap);
    return mBlurredBitmap;
}