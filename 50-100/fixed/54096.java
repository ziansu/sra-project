@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    isFromWeatherActivity = getIntent().getBooleanExtra("from_weather_activity", false);
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    if ((prefs.getBoolean("city_selected", false)) && (!(isFromWeatherActivity))) {
        android.content.Intent i = new android.content.Intent(this, com.qind.weather.activity.WeatherActivity.class);
        startActivity(i);
        finish();
        return ;
    }
    setContentView(R.layout.choose_area);
    init();
}