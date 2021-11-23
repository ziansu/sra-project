@java.lang.Override
public void onPause() {
    super.onPause();
    pauseMedia();
    buildNotification(PlaybackStatus.PAUSED);
}