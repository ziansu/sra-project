@java.lang.Override
public void setPlaybackParams(android.media.PlaybackParams playbackParams) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        if (((mMediaPlayer) == null) || (!(mPrepared))) {
            mPlaybackParams = playbackParams;
        }else {
            mMediaPlayer.setPlaybackParams(playbackParams);
            if (((mState) != (android.support.v4.media.session.PlaybackStateCompat.STATE_PLAYING)) && (mMediaPlayer.isPlaying())) {
                mState = android.support.v4.media.session.PlaybackStateCompat.STATE_PLAYING;
            }
            if ((mCallback) != null) {
                mCallback.onPlaybackStatusChanged(mState);
            }
        }
    }
}