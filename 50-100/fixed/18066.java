@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    mIsUserSeeking = false;
    if ((mMediaPlayer) == null) {
        return ;
    }
    mMediaSeekBar.setSecondaryProgress(0);
    onSeekBarMoved(java.util.concurrent.TimeUnit.SECONDS.toMillis(seekBar.getProgress()));
    refreshSeekPosition(java.util.concurrent.TimeUnit.SECONDS.toMillis(seekBar.getProgress()), mMediaPlayer.getStreamDuration());
}