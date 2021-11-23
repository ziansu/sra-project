public void setTextAnimated(boolean animated) {
    mAnimated = animated;
    if (animated) {
        setTextColor(Color.TRANSPARENT);
    }else {
        setTextColor(mOriginalTextColors);
    }
}