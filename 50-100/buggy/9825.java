@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    long progressTime = savedInstanceState.getLong(app.park.com.vr.VrVideoActivity.STATE_PROGRESS_TIME);
    mVrVideoView.seekTo(progressTime);
    isPaused = savedInstanceState.getBoolean(app.park.com.vr.VrVideoActivity.STATE_IS_PAUSED);
    if (isPaused) {
        mVrVideoView.pauseVideo();
    }
}