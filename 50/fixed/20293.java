@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    mp.seekTo(seekBar.getProgress());
}