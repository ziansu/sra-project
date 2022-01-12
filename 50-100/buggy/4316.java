private void hideStatusBar() {
    android.view.View decorView = getWindow().getDecorView();
    int visibility = 0;
    if ((Build.VERSION.SDK_INT) >= 16) {
        visibility |= android.view.View.SYSTEM_UI_FLAG_FULLSCREEN;
    }
    if ((Build.VERSION.SDK_INT) >= 19) {
        visibility |= android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
    }
    decorView.setSystemUiVisibility(visibility);
}