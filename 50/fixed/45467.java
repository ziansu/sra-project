private void updateBg(int color) {
    android.graphics.drawable.Drawable _bg = mTargetView.getBackground();
    if (_bg instanceof android.graphics.drawable.GradientDrawable) {
        ((android.graphics.drawable.GradientDrawable) (_bg)).setColor(color);
    }
}