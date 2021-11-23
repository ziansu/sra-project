public void setSlideOffset(int offset) {
    mSlideOffset = java.lang.Math.min(java.lang.Math.max(0, offset), mSlideMaxHeight);
    requestLayout();
}