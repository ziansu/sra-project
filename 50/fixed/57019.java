@java.lang.Override
public void onWindowFocusChanged(final boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (me.ccrama.redditslide.SettingValues.immersiveMode) {
        if (hasFocus) {
            hideDecor();
        }
    }
}