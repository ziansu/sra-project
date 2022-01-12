@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initBinding();
    if (savedInstanceState != null) {
        mFragmentTag = savedInstanceState.getString(com.huhx0015.doordashchallenge.view.activities.MainActivity.INSTANCE_FRAGMENT_TAG, null);
        mLatitude = savedInstanceState.getDouble(com.huhx0015.doordashchallenge.view.activities.MainActivity.INSTANCE_LATITUDE, DashConstants.DOORDASH_LAT);
        mLongitude = savedInstanceState.getDouble(com.huhx0015.doordashchallenge.view.activities.MainActivity.INSTANCE_LONGITUDE, DashConstants.DOORDASH_LNG);
        mIsLocationPermissionsAsked = savedInstanceState.getBoolean(com.huhx0015.doordashchallenge.view.activities.MainActivity.INSTANCE_IS_LOCATION_PERMISSIONS_ASKED);
    }
    initView();
    if ((!(mIsLocationPermissionsAsked)) || ((mFragmentTag) == null)) {
        initServices();
    }
}