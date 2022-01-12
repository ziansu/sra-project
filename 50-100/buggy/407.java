private void refreshLocationAndWeather() {
    if ((_adapter) != null) {
        _adapter.clear();
        _adapter.notifyDataSetChanged();
    }
    _currentLocation = getGoogleLocation();
    android.util.Log.d(com.beccap.weathervane.WeatherListFragment.TAG, ("currentLocation: " + (_currentLocation.toString())));
    if ((_currentLocation) != null) {
        android.util.Log.d(com.beccap.weathervane.WeatherListFragment.TAG, "loading weather");
        new com.beccap.weathervane.model.WeatherLoader(this).startLoading(_currentLocation, 10);
    }
}