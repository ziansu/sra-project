@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tab);
    android.widget.Toolbar toolbar = ((android.widget.Toolbar) (findViewById(R.id.toolbar)));
    setActionBar(toolbar);
    activityContext = this;
    setupFragements();
    setupFloatingActionButton();
    eventsManager = new de.grau.organizer.database.EventsManagerRealm();
    eventsManager.open();
}