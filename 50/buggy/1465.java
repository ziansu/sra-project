public void changeCity(java.lang.String city) {
    com.a5corp.weather.fragment.WeatherFragment wf = ((com.a5corp.weather.fragment.WeatherFragment) (getSupportFragmentManager().findFragmentById(R.id.fragment)));
    GlobalActivity.cp.setCity(city);
}