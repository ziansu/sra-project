@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mFile = getIntent().getParcelableExtra(com.stevenschoen.putionew.tv.TvPlaybackOverlayActivity.ARG_FILE);
    setContentView(R.layout.tv_playback_activity);
    loadViews();
    setupCallbacks();
}