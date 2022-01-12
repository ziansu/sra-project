@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    adView = ((com.google.android.gms.ads.AdView) (this.findViewById(R.id.ad)));
    mActionBarToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar_actionbar)));
    setSupportActionBar(mActionBarToolbar);
    setupActionBar();
    prepareMap();
    prepareInterstitalAd();
    startTracking();
    loadAd();
}