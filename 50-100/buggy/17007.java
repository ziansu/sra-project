@java.lang.Override
public void onCreate() {
    super.onCreate();
    mSharedPrefHelper = new com.comli.shapira.aroundme.helpers.SharedPrefHelper(this);
    mProviderName = mSharedPrefHelper.getLastUsedLocationProvider();
    mFirstTime = false;
    mConnectedToastAlreadyDisplayed = true;
    if (mProviderName.isEmpty()) {
        mProviderName = android.location.LocationManager.GPS_PROVIDER;
        mFirstTime = true;
        mConnectedToastAlreadyDisplayed = false;
    }
    mFirstTime = true;
    mLastLocation = null;
    mLocationProvider = new com.comli.shapira.aroundme.location_provider.CurrentLocationProvider(this);
    mLocationProvider.setOnLocationChangeListener(this);
    startProvider(mProviderName);
}