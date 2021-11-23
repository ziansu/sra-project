public void setDynamicLineLength(float scale) {
    clearAnimator();
    baseLineLength = ((int) ((((maxLineLength) - (minLineLength)) * scale) + (minLineLength)));
    init();
    invalidate();
}