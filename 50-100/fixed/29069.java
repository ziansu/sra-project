public void toggle() {
    int uiOptions = getWindow().getDecorView().getSystemUiVisibility();
    int newUiOptions = uiOptions;
    newUiOptions ^= android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    newUiOptions ^= android.view.View.SYSTEM_UI_FLAG_FULLSCREEN;
    newUiOptions ^= android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
    getWindow().getDecorView().setSystemUiVisibility(newUiOptions);
}