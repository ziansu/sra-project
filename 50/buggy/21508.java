@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    mService.onCommand(MediaService.ACTION_SETTIME, java.lang.String.valueOf((((float) (seekBar.getProgress())) / 1000)), 0);
}