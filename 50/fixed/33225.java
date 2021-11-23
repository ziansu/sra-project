@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    seekTo(currentTime);
    updateSeekbar();
}