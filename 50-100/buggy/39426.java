public void show() {
    android.util.Log.i(TAG, "show");
    if (hasShow()) {
        android.util.Log.i(TAG, "hasShow() == true");
        return ;
    }
    mTargetView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    this.setBackgroundColor(Color.TRANSPARENT);
    mDecorView.addView(this);
}