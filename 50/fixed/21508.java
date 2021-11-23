@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    if ((mService) != null) {
        mService.onCommand(MediaService.ACTION_SETTIME, java.lang.String.valueOf((((float) (seekBar.getProgress())) / 1000)), 0);
    }
}