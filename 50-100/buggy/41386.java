@java.lang.Override
public void onCreate() {
    super.onCreate();
    dataSource = new org.melayjaire.boimela.data.BookDataSource(this);
    dataSource.open();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(bookUpdateBroadcastReceiver, new android.content.IntentFilter(org.melayjaire.boimela.utils.Constants.ACTION_UPDATE_BOOK));
    createPublisherToBooksMap();
    nearbyPublishers = new java.util.HashSet<>();
    userLocationListener = new org.melayjaire.boimela.service.BookTrackerService.UserLocationListener(this);
    notifyUser(getDummyBooks());
}