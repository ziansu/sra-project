@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (hasFocus) {
        delayedHide(com.example.app.jpegstreamming.MainActivity.INITIAL_HIDE_DELAY);
    }else {
        mHideHandler.removeMessages(0);
    }
}