private void showDateInfoView() {
    weather_current_date.setText(currentWeather.getWeather_current_date());
    java.lang.String dateResult = sharedPreferences.getString("date_format", "yyyy年MM月dd日");
    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(dateResult);
    java.lang.String dateSet = simpleDateFormat.format(new java.util.Date());
    weather_current_date.setText(dateSet);
}