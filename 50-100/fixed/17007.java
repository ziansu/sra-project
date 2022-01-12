@java.lang.Override
public void onCreate() {
    super.onCreate();
    mSharedPrefHelper = new com.comli.shapira.aroundme.helpers.SharedPrefHelper(this);
    mLastLocation = null;
    mFirstTime = false;
    mConnectedToastAlreadyDisplayed = true;
    mProviderName = mSharedPrefHelper.getLastUsedLocationProvider();
    if (mProviderName.isEmpty()) {
        mProviderName = android.location.LocationManager.GPS_PROVIDER;
        mFirstTime = true;
        mConnectedToastAlreadyDisplayed = false;
    }
    mLocationProvider = new com.comli.shapira.aroundme.location_provider.CurrentLocationProvider(this);
    mLocationProvider.setOnLocationChangeListener(this);
    startProvider(mProviderName);
}