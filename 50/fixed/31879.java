@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    int progress = seekBar.getProgress();
    mediaPlayer.seekTo(progress);
}