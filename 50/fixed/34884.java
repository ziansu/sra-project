@java.lang.Override
public void doFrame(long vsyncTimeNs) {
    sampledVsyncTimeNs = vsyncTimeNs;
    if ((choreographer) != null) {
        choreographer.postFrameCallbackDelayed(this, com.google.android.exoplayer2.video.VideoFrameReleaseTimeHelper.CHOREOGRAPHER_SAMPLE_DELAY_MILLIS);
    }
}