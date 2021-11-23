@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_favourites);
    initGoogleApiClient();
    retrieveDeviceNode();
    Wearable.MessageApi.addListener(googleApiClient, this);
    shape = org.thecosmicfrog.luasataglance.util.Preferences.loadScreenShape(getApplicationContext());
    stub = ((android.support.wearable.view.WatchViewStub) (findViewById(R.id.watch_view_stub)));
    stub.setOnLayoutInflatedListener(new android.support.wearable.view.WatchViewStub.OnLayoutInflatedListener() {
        @java.lang.Override
        public void onLayoutInflated(android.support.wearable.view.WatchViewStub stub) {
        }
    });
}