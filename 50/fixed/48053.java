@java.lang.Override
public void onCreate() {
    android.util.Log.e("check", "service has started");
    songPosn = 0;
    player = new android.media.MediaPlayer();
    initMusicPlayer();
    super.onCreate();
}