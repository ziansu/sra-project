private void updateWeather() {
    com.example.mshukla.cloudy.FetchWeatherTask weatherTask = new com.example.mshukla.cloudy.FetchWeatherTask(getContext());
    java.lang.String location = com.example.mshukla.cloudy.Utility.getPreferredLocation(getContext());
    weatherTask.execute(location);
}