public void reset() {
    app.park.com.vr.VrVideoActivity.isGameOver = false;
    android.util.Log.d(app.park.com.vr.VrVideoActivity.TAG, "[TEST] ========== RESET ==============");
    mVrVideoView.seekTo(0);
    app.park.com.vr.VrVideoActivity.currTime = 0;
    android.util.Log.d(app.park.com.vr.VrVideoActivity.TAG, ("[TEST] current position = " + (mVrVideoView.getCurrentPosition())));
    resetScore();
}