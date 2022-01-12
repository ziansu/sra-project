@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_server);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    initViews();
    musicPlayer = new tk.bugnotwolf.sharejack.MusicPlayer(this);
    setFileButton.setEnabled(true);
    playButton.setEnabled(false);
    pauseButton.setEnabled(false);
    stopButton.setEnabled(false);
    shareButton.setEnabled(false);
    seekBar.setMax(180000);
}