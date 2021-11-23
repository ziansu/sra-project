@java.lang.Override
public void onDestroy() {
    if ((mNoisyReceiver) != null) {
        unregisterReceiver(mNoisyReceiver);
    }
    if ((mMediaSession) != null) {
        mMediaSession.release();
        mMediaSession = null;
    }
    removeNotifications();
    com.quovantis.music.music.MusicService.sIsServiceDestroying = false;
    com.quovantis.music.music.MusicService.sIsNotificationCreated = false;
    mNotificationManager = null;
    mNotification = null;
    mNotificationHelper = null;
    mPlaybackManager = null;
    com.quovantis.music.helper.LoggerHelper.d("Music Service Destroyed");
    super.onDestroy();
}