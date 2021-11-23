@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    localDataSource = ((com.havrylyuk.weather.WeatherApp) (getApplicationContext())).getLocalDataSource();
    setContentView(getLayout());
    if (com.havrylyuk.weather.util.PreferencesHelper.getInstance().isUseCurrentLocation(this)) {
        askForPermission(Manifest.permission.ACCESS_FINE_LOCATION, com.havrylyuk.weather.activity.BaseActivity.PERMISSIONS_REQUEST_LOCATION);
    }
}