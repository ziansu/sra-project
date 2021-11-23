public void update(com.beccap.weathervane.model.WeatherStatus weatherStatus, android.location.Location currentLocation) {
    _weatherStatus = weatherStatus;
    _currentLocation = currentLocation;
    updateView(getView());
    android.util.Log.d(com.beccap.weathervane.WeatherStatusFragment.TAG, "calling updateMap from update()");
    updateMap();
}