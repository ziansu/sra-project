@java.lang.Override
public void onCreate() {
    super.onCreate();
    dataSource = new org.melayjaire.boimela.data.BookDataSource(this, new org.melayjaire.boimela.data.BookDataSource.OnDataChangeListener() {
        @java.lang.Override
        public void onUpdate() {
            createPublisherToBooksMap();
        }
    });
    dataSource.open();
    createPublisherToBooksMap();
    nearbyPublishers = new java.util.HashSet<>();
    userLocationListener = new org.melayjaire.boimela.service.BookTrackerService.UserLocationListener(this);
    notifyUser(getDummyBooks());
}