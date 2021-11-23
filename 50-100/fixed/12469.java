private void updateLocation(android.location.Location location) {
    if (location != null) {
        currentLocation.setText(com.example.xialong.funplacesforkids.util.Util.getCity(this, location.getLatitude(), location.getLongitude()));
        weather.execute(location.getLatitude(), location.getLongitude());
    }else {
        currentLocation.setText(WeatherUtil.DEFAULT_LOCATION);
    }
}