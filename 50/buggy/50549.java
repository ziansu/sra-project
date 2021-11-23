@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    if (((isInPlaybackState()) && ((mMediaController) != null)) && ((mCurrentState) != (meng.videoplayproto.widget.TextureVideoView.STATE_PLAYBACK_COMPLETED))) {
        toggleMediaControlsVisibility();
    }
    return false;
}