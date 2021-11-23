@java.lang.Override
public void onCreate() {
    super.onCreate();
    player = new android.media.MediaPlayer();
    player.setAudioStreamType(AudioManager.STREAM_MUSIC);
    player.setWakeMode(getApplicationContext(), PowerManager.PARTIAL_WAKE_LOCK);
    player.setOnPreparedListener(this);
    player.setOnErrorListener(this);
    player.setOnCompletionListener(this);
    if (new com.odong.buddhismhomework.utils.KvHelper(this).get("mp3.replay", java.lang.Boolean.class, false)) {
        player.setLooping(true);
    }
}