@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    info.iamlaine.h4.alarmclock.MainActivity.ins = this;
    android.media.AudioManager audioManager = ((android.media.AudioManager) (getSystemService(Context.AUDIO_SERVICE)));
    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 20, 0);
    mediaPlayer = android.media.MediaPlayer.create(this, R.raw.alarm_2);
    mediaPlayer.setLooping(true);
    setContentView(R.layout.activity_main);
    android.content.Intent alarmIntent = new android.content.Intent(this, info.iamlaine.h4.alarmclock.AlarmReceiver.class);
    pendingIntent = android.app.PendingIntent.getBroadcast(this, 0, alarmIntent, 0);
}