public void setIndex(java.lang.String index) {
    mIndex = index;
    android.graphics.Rect bound = new android.graphics.Rect();
    mPaint.getTextBounds(mIndex, 0, mIndex.length(), bound);
    mTextWidth = bound.width();
    mTextHeight = bound.height();
    invalidate();
}