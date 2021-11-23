@java.lang.Override
protected void onStop() {
    dttv.app.utils.Log.i(TAG, "enterStop");
    mState = dttv.app.VideoPlayerActivity.PLAYER_STOP;
    mMediaPlayer.stop();
    super.onStop();
}