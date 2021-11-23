@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.track_me);
    checkLocationPermission();
    buildGoogleApiClient();
    initUserInfo();
    initUI();
    mRequestingLocationUpdates = false;
    mLastUpdateTime = 0;
    runningRecord = new edu.stjohns.cus1194.stride.data.RunningRecord();
    updateValuesFromBundle(savedInstanceState);
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    mapsFragment = new com.example.jsung721.ronaldmcdonald_prototype1.MapsFragment();
    fragmentTransaction.add(R.id.frame_track_me_fragment_map, mapsFragment).commit();
}