private void serviceInit() {
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    int updateTime = sharedPreferences.getInt("update_time", 1);
    boolean serviceFlag = sharedPreferences.getBoolean("service_flag", true);
    if (serviceFlag) {
        android.content.Intent updateIntent = new android.content.Intent(this, com.snow.app.snowweather.service.UpdateWeatherInfoService.class);
        stopService(updateIntent);
        updateIntent.putExtra("update_times", updateTime);
        startService(updateIntent);
    }
}