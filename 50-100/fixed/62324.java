@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    info.iamlaine.h4.alarmclock.MainActivity.ins = this;
    android.media.AudioManager audioManager = ((android.media.AudioManager) (getSystemService(Context.AUDIO_SERVICE)));
    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 20, 0);
    setContentView(R.layout.activity_main);
}