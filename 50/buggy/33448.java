@java.lang.Override
public void onDestroy() {
    mMediaController.getTransportControls().stop();
    mMediaNotificationManager.stopNotification();
    mMediaSession.release();
}