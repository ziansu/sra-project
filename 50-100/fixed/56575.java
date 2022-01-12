@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_play);
    youTubeView = ((com.google.android.youtube.player.YouTubePlayerView) (findViewById(R.id.youtube_player)));
    youTubeView.initialize(DeveloperKey.DEVELOPER_KEY, this);
    android.content.Intent intent = getIntent();
    videoID = intent.getStringExtra("VIDEO_ID");
}