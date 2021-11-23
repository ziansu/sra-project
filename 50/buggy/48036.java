@butterknife.OnClick(value = R.id.hourlybutton)
public void startHourlyActivity(android.view.View view) {
    mMixpanel.track("View Hourly", null);
    android.content.Intent intent = new android.content.Intent(this, com.moockpanel.weatherpanel.UI.HourlyForecastActivity.class);
    intent.putExtra(com.moockpanel.weatherpanel.UI.MainActivity.HOURLY_FORECAST, mForecast.getHourlyForecast());
    startActivity(intent);
}