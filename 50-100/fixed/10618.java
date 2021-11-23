@java.lang.Override
public void seekToUs(long positionUs) {
    com.google.android.exoplayer.util.Assertions.checkState(prepared);
    com.google.android.exoplayer.util.Assertions.checkState(((enabledTrackCount) > 0));
    long currentPositionUs = (isPendingReset()) ? pendingResetPositionUs : downstreamPositionUs;
    downstreamPositionUs = positionUs;
    lastSeekPositionUs = positionUs;
    if (currentPositionUs == positionUs) {
        return ;
    }
    seekToInternal(positionUs);
}