@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.xugaoxiang.live_vtm.utils.PreUtils.setInt(this, com.xugaoxiang.live_vtm.activity.MainActivity.PROGRAM_KEY, programIndex);
    if ((receiver) != null) {
        unregisterReceiver(receiver);
    }
    if ((mVideoView) != null) {
        mVideoView.stopPlayback();
        mVideoView = null;
    }
    finish();
}