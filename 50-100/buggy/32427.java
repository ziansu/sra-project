@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (!hasFocus)
        return ;
    
    if (!(com.bifrostentertainment.rainbow.RainbowActivity.kSupportsImmersiveFullScreenMode)) {
        if (com.bifrostentertainment.rainbow.RainbowActivity.kSupportsLowProfileSystemUI) {
            mDimmerHandler.removeCallbacks(mDimmerRunnable);
            dimSystemUI();
        }
        return ;
    }
    contentView().setSystemUiVisibility(((((((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)));
}