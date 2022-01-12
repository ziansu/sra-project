@java.lang.Override
protected com.example.myweatherapp.DataModel doInBackground(java.lang.String... params) {
    com.example.myweatherapp.DataModel dataModel = new com.example.myweatherapp.DataModel();
    java.lang.String data = new com.example.myweatherapp.WeatherHttpClient().getWeatherData(params[0]);
    try {
        dataModel = com.example.myweatherapp.JSONParseModel.getData(data);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return dataModel;
}