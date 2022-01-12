@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_favourites);
    initGoogleApiClient();
    Wearable.MessageApi.addListener(googleApiClient, this);
    retrieveDeviceNode();
    shape = org.thecosmicfrog.luasataglance.util.Preferences.loadScreenShape(getApplicationContext());
    stub = ((android.support.wearable.view.WatchViewStub) (findViewById(R.id.watch_view_stub)));
}