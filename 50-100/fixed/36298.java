@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_player);
    getActionBar().setDisplayHomeAsUpEnabled(true);
    playerConnection = new pconley.vamp.PlayerActivity.PlayerServiceConnection();
    playerReceiver = new pconley.vamp.PlayerActivity.PlayerEventReceiver();
    progress = ((android.widget.SeekBar) (findViewById(R.id.playback_progress)));
    progress.setOnSeekBarChangeListener(new pconley.vamp.PlayerActivity.OnSeekBarChangeListener());
}