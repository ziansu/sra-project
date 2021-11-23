@java.lang.Override
public void seekToUs(long positionUs) {
    com.google.android.exoplayer.util.Assertions.checkState(prepared);
    com.google.android.exoplayer.util.Assertions.checkState(((enabledTrackCount) > 0));
    positionUs = (chunkSource.isLive()) ? 0 : positionUs;
    long currentPositionUs = (isPendingReset()) ? pendingResetPositionUs : downstreamPositionUs;
    downstreamPositionUs = positionUs;
    lastSeekPositionUs = positionUs;
    if (currentPositionUs == positionUs) {
        return ;
    }
    seekToInternal(positionUs);
}