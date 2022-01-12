@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    mMediaController.getTransportControls().seekTo(getProgress());
    mIsTracking = false;
}