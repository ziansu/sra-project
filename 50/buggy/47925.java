@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    super.onCreate();
    mTrackPosition = 0;
    mPlayer = new android.media.MediaPlayer();
    initMusicPlayer();
    return START_STICKY;
}