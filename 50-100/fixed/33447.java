@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_screen_fragment);
    isStoragePermissionGranted();
    ben.avgmovies.notifications.NotificationPublisher notifPublisher = new ben.avgmovies.notifications.NotificationPublisher(TRIGGER_TIME);
    notifPublisher.scheduleNotification(this);
    getSupportActionBar().setDisplayShowHomeEnabled(true);
    getSupportActionBar().setLogo(R.drawable.ic_action);
    getSupportActionBar().setDisplayUseLogoEnabled(true);
    getSupportFragmentManager().beginTransaction().replace(R.id.listFragmentContainer, new ben.avgmovies.fragments.SearchFragment()).commit();
}