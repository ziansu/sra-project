public void onCreate() {
    super.onCreate();
    Loop = Repeat.ALL;
    songposition = 0;
    mediaPlayer = new android.media.MediaPlayer();
    mp_init();
}