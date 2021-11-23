@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_play_sound_file);
    mMediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {
        public void onCompletion(android.media.MediaPlayer mp) {
            mp.release();
        }
    });
    mGestureDetector = new android.view.GestureDetector(this, this);
    mGestureDetector.setOnDoubleTapListener(this);
    android.content.Intent callingIntent = getIntent();
    java.lang.String fileName = callingIntent.getStringExtra(Intent.EXTRA_TEXT);
    mMediaPlayer = new android.media.MediaPlayer();
    playAudio(fileName);
}