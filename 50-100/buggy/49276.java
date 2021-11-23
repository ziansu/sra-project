@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.v("MediaPlayer", "Forward");
    if (((mMediaPlayer) != null) && (mPrepared)) {
        int seekTime = (mMediaPlayer.getCurrentPosition()) + (com.xamoom.android.xamoomcontentblocks.ViewHolders.ContentBlock1ViewHolder.SEEK_TIME);
        if (seekTime > (mMediaPlayer.getCurrentPosition())) {
            seekTime = mMediaPlayer.getDuration();
        }
        mMediaPlayer.seekTo(seekTime);
        updateProgress();
    }
}