public int getWidthMeasureDrawText() {
    return (((mTextView.getPaddingLeft()) + (java.lang.Math.round(mPaint.measureText((null == (mDrawText) ? "" : mDrawText))))) + 10) + (mTextView.getTotalPaddingRight());
}