private void stopMedia() {
    if ((mediaPlayer) == null)
        return ;
    
    if (mediaPlayer.isPlaying()) {
        mediaPlayer.stop();
    }
    org.greenrobot.eventbus.EventBus.getDefault().postSticky(new com.ashokgujju.newsonair.MediaPlayerServiceResult(android.app.Activity.RESULT_OK, PlaybackStatus.STOPPED));
    removeNotification();
}