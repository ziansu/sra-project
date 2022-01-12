private void enableForecastConditionsAdapter() {
    if (!(forecast.isEmpty())) {
        gavinnicol.zapposweather.ForecastAdapter forecastAdapter = new gavinnicol.zapposweather.ForecastAdapter(getApplicationContext(), R.layout.forecast_row_layout, forecast);
        android.widget.ListView forecastView = ((android.widget.ListView) (findViewById(R.id.forecast_list)));
        forecastView.setAdapter(forecastAdapter);
        forecastAdapter.notifyDataSetChanged();
    }
}