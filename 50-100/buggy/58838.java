@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_event_detail);
    android.support.v4.app.ActivityCompat.postponeEnterTransition(this);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setToolbar(toolbar);
    setNavigationToolbar();
    if (savedInstanceState == null) {
        eventId = getIntent().getIntExtra(com.belatrixsf.connect.ui.event.detail.EventDetailActivity.EVENT_ID_KEY, (-1));
    }
    initViews();
}