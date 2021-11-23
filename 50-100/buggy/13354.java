protected void onPostExecute(android.learn.com.tripmanager.List list) {
    super.onPostExecute(list);
    windSpeed.setText(java.lang.String.valueOf(list.wind.getSpeed()));
    press.setText(java.lang.String.valueOf(list.currentCondition.getPressure()));
    hum.setText(java.lang.String.valueOf(list.currentCondition.getHumidity()));
    android.util.Log.d("Temperature- alerts---", java.lang.String.valueOf(list.temperature.getTemp()));
    temp.setText(java.lang.String.valueOf(list.temperature.getTemp()));
}