@java.lang.Override
public void onStartTrackingTouch(pct.droid.widget.SeekBar seekBar) {
    mIsUserSeeking = true;
    mSeekBar.setSecondaryProgress(seekBar.getProgress());
    stopUpdating();
}