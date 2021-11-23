@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    if (hasFocus) {
        if (fullscreenMode) {
            activateFullscreen();
        }
    }
}