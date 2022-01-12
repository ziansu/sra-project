@java.lang.Override
public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
    if (((mExoPlayer) == null) || ((mMediaSession) == null)) {
        return ;
    }
    if ((playbackState == (com.google.android.exoplayer2.ExoPlayer.STATE_READY)) && playWhenReady) {
        mStateBuilder.setState(PlaybackStateCompat.STATE_PLAYING, mExoPlayer.getCurrentPosition(), 1.0F);
    }else
        if (playbackState == (com.google.android.exoplayer2.ExoPlayer.STATE_READY)) {
            mStateBuilder.setState(PlaybackStateCompat.STATE_PAUSED, mExoPlayer.getCurrentPosition(), 1.0F);
        }
    
    mMediaSession.setPlaybackState(mStateBuilder.build());
}