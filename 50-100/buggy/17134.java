@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mLocationClient = new com.baidu.location.LocationClient(getApplicationContext());
    mLocationClient.registerLocationListener(new com.example.android.android_app.HomeActivity.MyLocationListener());
    com.baidu.mapapi.SDKInitializer.initialize(getApplicationContext());
    setContentView(R.layout.activity_home);
    getPermissions();
    setDefaultFragment();
    setBottomNavigator();
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.discoverToolBar)));
    setSupportActionBar(toolbar);
    loged = false;
}