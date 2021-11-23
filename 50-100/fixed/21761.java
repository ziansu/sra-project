@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fg_main_activity_wear);
    stub = ((android.support.wearable.view.WatchViewStub) (findViewById(R.id.watch_view_stub)));
    stub.setOnLayoutInflatedListener(new android.support.wearable.view.WatchViewStub.OnLayoutInflatedListener() {
        @java.lang.Override
        public void onLayoutInflated(android.support.wearable.view.WatchViewStub stub) {
            loadFoodImages();
        }
    });
}