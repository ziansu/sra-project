public void show() {
    android.util.Log.i(TAG, "show");
    if (hasShow()) {
        return ;
    }
    mTargetView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    this.setBackgroundColor(Color.TRANSPARENT);
    mDecorView.addView(this);
}