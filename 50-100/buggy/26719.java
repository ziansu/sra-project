public void initializeVacationMode() {
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.mainListView)));
    listView.setVisibility(View.GONE);
    android.widget.TextView currentTemp = ((android.widget.TextView) (findViewById(R.id.textView)));
    currentTemp.setText(("Current: " + (java.lang.String.format(java.util.Locale.ENGLISH, "%.1f", TemperatureManager.vacation_temp))));
    com.example.tema.thermostat.MainActivity.targetTemperature = TemperatureManager.vacation_temp;
    initializeView();
}