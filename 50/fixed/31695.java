public com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfo copyWithPeriodIndex(int periodIndex) {
    com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfo playbackInfo = new com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfo(periodIndex, startPositionUs);
    playbackInfo.positionUs = positionUs;
    playbackInfo.bufferedPositionUs = bufferedPositionUs;
    playbackInfo.videoPositionUs = videoPositionUs;
    return playbackInfo;
}