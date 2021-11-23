@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    try {
        mHandler.removeCallbacks(mUpdateTimeTask);
        int totalDuration = mp.getDuration();
        int currentPosition = utils.progressToTimer(seekBar.getProgress(), totalDuration);
        mp.seekTo(currentPosition);
        updateProgressBar();
    } catch (java.lang.Exception e) {
    }
}