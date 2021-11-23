@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_map);
    butterknife.ButterKnife.bind(this);
    mMapView.onCreate(savedInstanceState);
    setupMap();
    mMapHelper = new com.mredrock.cyxbs.util.MapHelper(this, mHandler);
    mMapHelper.readMapPictureFromCache();
}