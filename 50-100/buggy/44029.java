@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    mPickOptions = de.greenrobot.event.EventBus.getDefault().getStickyEvent(Events.OnPublishPickOptionsEvent.class).options;
    initTheme();
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pick);
    addToolbarToLayout();
    initFab();
    initActionbar();
    updateFab();
    setupAlbums(savedInstanceState);
}