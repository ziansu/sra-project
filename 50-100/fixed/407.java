private void refreshLocationAndWeather() {
    if ((_adapter) != null) {
        _adapter.clear();
        _adapter.notifyDataSetChanged();
    }
    _currentLocation = getGoogleLocation();
    if ((_currentLocation) != null) {
        new com.beccap.weathervane.model.WeatherLoader(this).startLoading(_currentLocation, 10);
    }
}