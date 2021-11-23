@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    displayLayout();
    android.util.Log.d(TAG, "Created me");
    info = "";
    if ((getIntent()) != null) {
        info = getIntent().getStringExtra(TvInputInfo.EXTRA_INPUT_ID);
        android.util.Log.d(TAG, info);
    }
    com.felkertech.channelsurfer.sync.SyncUtils.setUpPeriodicSync(this, info);
    setupTvInputProvider();
}