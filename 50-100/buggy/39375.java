public android.graphics.Bitmap blur(int radius) {
    if (((mLastRadius) == radius) && ((mBlurredBitmap) != null)) {
        return mBlurredBitmap;
    }
    this.mLastRadius = radius;
    this.mRadius = radius;
    if ((mOriginalBitmap) == null)
        return null;
    
    if ((mBlurredBitmap) != null)
        mBlurredBitmap.recycle();
    
    mBlurredBitmap = mBlurAlgorithm.blur(mOriginalBitmap);
    return mBlurredBitmap;
}