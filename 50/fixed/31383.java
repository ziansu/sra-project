@java.lang.Override
protected void onDestroy() {
    dttv.app.utils.Log.i(TAG, "enter onDestroy");
    if ((mMediaPlayer) != null) {
        mMediaPlayer.stop();
        mMediaPlayer.release();
        mMediaPlayer = null;
    }
    super.onDestroy();
}