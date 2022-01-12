public static void setVCAPServices() throws org.json.JSONException {
    java.lang.String services = java.lang.System.getenv("VCAP_SERVICES");
    org.json.JSONObject servicesObject = new org.json.JSONObject(services);
    org.json.JSONObject weatherCredentials = null;
    weatherCredentials = servicesObject.getJSONArray("weatherinsights").getJSONObject(0).getJSONObject("credentials");
    com.ibm.IoTForWeather.WeatherFunctions.InsightsForWeather.WEATHER_API_URL = weatherCredentials.getString("url");
    com.ibm.IoTForWeather.WeatherFunctions.InsightsForWeather.WEATHER_API_USERNAME = weatherCredentials.getString("username");
    com.ibm.IoTForWeather.WeatherFunctions.InsightsForWeather.WEATHER_API_PASSWORD = weatherCredentials.getString("password");
    com.ibm.IoTForWeather.WeatherFunctions.InsightsForWeather.WEATHER_HOST_URL = weatherCredentials.getString("host");
}