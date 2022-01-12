public void setStickInnerColor(int aStickInnerColor) {
    mStickInnerColor = aStickInnerColor;
    init();
    invalidate();
    requestLayout();
}