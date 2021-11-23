@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    android.util.Log.d(com.beccap.weathervane.WeatherListFragment.TAG, "onConnected");
    refreshLocationAndWeather();
}