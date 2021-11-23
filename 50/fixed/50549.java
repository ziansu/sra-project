@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    if ((isInPlaybackState()) && ((mMediaController) != null)) {
        toggleMediaControlsVisibility();
    }
    return false;
}