private void updateWeather() {
    com.example.mshukla.cloudy.FetchWeatherTask weatherTask = new com.example.mshukla.cloudy.FetchWeatherTask(getActivity());
    java.lang.String location = com.example.mshukla.cloudy.Utility.getPreferredLocation(getActivity());
    weatherTask.execute(location);
}