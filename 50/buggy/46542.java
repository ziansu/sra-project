public void enable() {
    if (((Build.VERSION.SDK_INT) >= 19) && ((Build.VERSION.SDK_INT) < 23)) {
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}