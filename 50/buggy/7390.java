public void setShadowColor(@android.support.annotation.ColorInt
int color) {
    if (color != (mShadowColor)) {
        setShadowInternal(mShadowRadius, color);
        invalidate();
    }
}