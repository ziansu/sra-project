protected void resetWindow() {
    decorView.setOnFocusChangeListener(null);
    decorView.setOnSystemUiVisibilityChangeListener(null);
    window.clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
}