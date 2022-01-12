private void updateBackground() {
    if (!(clearBackground)) {
        mDrawable = getBackground();
        invalidate();
    }
}