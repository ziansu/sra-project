public void addCurrentValuesDatabase(com.example.jeka.exampledrawerbar.model.WeatherItem item) {
    if (!(item.getTemperature().equals(""))) {
        com.example.jeka.exampledrawerbar.database.ForecastDatabaseQuery.sDatabase.delete(ForecastDbSchema.CurrentWeatherTable.CURRENT_NAME, null, null);
    }
    android.content.ContentValues currentValues = com.example.jeka.exampledrawerbar.database.ForecastDatabaseQuery.getCurrentWeatherContentValue(item);
    com.example.jeka.exampledrawerbar.database.ForecastDatabaseQuery.sDatabase.insert(ForecastDbSchema.CurrentWeatherTable.CURRENT_NAME, null, currentValues);
}