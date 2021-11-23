@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    mPickOptions = de.greenrobot.event.EventBus.getDefault().getStickyEvent(Events.OnPublishPickOptionsEvent.class).options;
    initTheme();
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pick);
    addToolbarToLayout();
    initActionbar(savedInstanceState);
    setupAlbums(savedInstanceState);
    initFab();
    updateFab();
}