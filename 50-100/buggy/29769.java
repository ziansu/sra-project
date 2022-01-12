public int getWidthMeasureDrawText() {
    return (((mTextView.getPaddingLeft()) + ((int) (mPaint.measureText(((mDrawText) == null ? "" : mDrawText))))) + 10) + (mTextView.getTotalPaddingRight());
}