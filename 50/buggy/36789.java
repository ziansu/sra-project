private void updateUI(com.ashokgujju.newsonair.PlaybackStatus status) {
    buildNotification(status);
    org.greenrobot.eventbus.EventBus.getDefault().postSticky(new com.ashokgujju.newsonair.MediaPlayerServiceResult(android.app.Activity.RESULT_OK, status));
}