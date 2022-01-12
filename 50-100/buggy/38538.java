public void setSize(int width, int height) {
    if ((mTargetView) instanceof android.widget.ImageView) {
        android.graphics.drawable.Drawable _bg = mTargetView.getBackground();
        if (_bg instanceof android.graphics.drawable.GradientDrawable) {
            _bg.mutate();
            ((android.graphics.drawable.GradientDrawable) (_bg)).setSize(width, height);
        }
    }
}