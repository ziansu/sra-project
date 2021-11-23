public void toggle() {
    int uiOptions = getWindow().getDecorView().getSystemUiVisibility();
    int newUiOptions = uiOptions;
    boolean isImmersiveModeEnabled = (uiOptions | (android.view.View.SYSTEM_UI_FLAG_IMMERSIVE)) == uiOptions;
    if (isImmersiveModeEnabled) {
        android.util.Log.i("RssReader", "Turning immersive mode mode off. ");
    }else {
        android.util.Log.i("RssReader", "Turning immersive mode mode on.");
    }
    newUiOptions ^= android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    newUiOptions ^= android.view.View.SYSTEM_UI_FLAG_FULLSCREEN;
    newUiOptions ^= android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
    getWindow().getDecorView().setSystemUiVisibility(newUiOptions);
}