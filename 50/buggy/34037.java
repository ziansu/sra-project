private void updateBackground() {
    if (!(clearBackground)) {
        mDrawable = getBackground();
        if ((getBackground()) == null) {
            setBackgroundColor(Color.TRANSPARENT);
        }
    }
    invalidate();
}