@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if ((mMediaPlayer) == null) {
        return ;
    }
    refreshSeekPosition(java.util.concurrent.TimeUnit.SECONDS.toMillis(seekBar.getProgress()), mMediaPlayer.getStreamDuration());
}