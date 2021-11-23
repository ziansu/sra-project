@java.lang.Override
protected com.example.gintas.weatherthing.Weather doInBackground(java.lang.String... params) {
    com.example.gintas.weatherthing.Weather weather = new com.example.gintas.weatherthing.Weather();
    java.lang.String data = new com.example.gintas.weatherthing.WeatherHTTPClient().getWeatherData(params[0]);
    try {
        weather = com.example.gintas.weatherthing.JSONParser.getWeather(data);
        weather.iconData = new com.example.gintas.weatherthing.WeatherHTTPClient().getImage(weather.currentCondition.getIcon());
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return weather;
}