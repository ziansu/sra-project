public void setStickBorderWidth(float aStickBorderWidth) {
    mStickBorderWidth = aStickBorderWidth;
    init();
    invalidate();
    requestLayout();
}