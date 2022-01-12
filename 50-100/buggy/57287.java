public android.graphics.Rect getWholeImageRect() {
    int orgWidth = (mBitmap.getWidth()) * (mLoadedSampleSize);
    int orgHeight = (mBitmap.getHeight()) * (mLoadedSampleSize);
    return new android.graphics.Rect(0, 0, orgWidth, orgHeight);
}