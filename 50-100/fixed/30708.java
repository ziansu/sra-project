@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.flCurrentWeather, new com.getlosthere.weatherme.fragments.CurrentWeatherFragment());
        ft.replace(R.id.flForecastWeather, new com.getlosthere.weatherme.fragments.ForecastWeatherFragment());
        ft.commit();
    }
}