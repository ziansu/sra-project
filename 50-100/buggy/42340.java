@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    initializeComponents();
    if (exchangeRatesFetcher.isOnline(this)) {
        exchangeRatesFetcher.execute();
    }
    if (savedInstanceState != null) {
        saveBundle(savedInstanceState);
    }
}