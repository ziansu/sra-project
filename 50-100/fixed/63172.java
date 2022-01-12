@java.lang.Override
public void seekTo(int pPosition) {
    if (!(this.mUtilsMediaPlayer.isMediaPlayerCreated())) {
        this.mCurrentPosition = pPosition;
    }else {
        boolean isPlaying = this.mUtilsMediaPlayer.isPlaying();
        this.mUtilsMediaPlayer.seekTo(pPosition);
        if (isPlaying) {
            this.mState = android.support.v4.media.session.PlaybackStateCompat.STATE_BUFFERING;
            if ((this.mCallback) != null) {
                this.mCallback.onPlaybackStatusChanged(this.mState);
            }
        }
    }
}