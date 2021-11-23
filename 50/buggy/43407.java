@java.lang.Override
protected void onPause() {
    super.onPause();
    mVideoView.pause();
    if ((receiver) != null) {
        unregisterReceiver(receiver);
    }
}