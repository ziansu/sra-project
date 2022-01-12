@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
private void setFullscreenFlags(boolean fullscreen) {
    int fullscreenFlags = android.view.View.SYSTEM_UI_FLAG_FULLSCREEN;
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        fullscreenFlags |= android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
    }
    setSystemUiFlags(fullscreenFlags, fullscreen);
}