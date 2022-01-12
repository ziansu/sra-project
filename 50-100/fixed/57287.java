public android.graphics.Rect getWholeImageRect() {
    if ((mBitmap) == null) {
        return null;
    }
    int orgWidth = (mBitmap.getWidth()) * (mLoadedSampleSize);
    int orgHeight = (mBitmap.getHeight()) * (mLoadedSampleSize);
    return new android.graphics.Rect(0, 0, orgWidth, orgHeight);
}