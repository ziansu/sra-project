private void displayData(org.jfree.data.category.DefaultCategoryDataset lineChart, wildtornado.org.forecasting.objects.Forecast forecast, java.lang.String message) {
    int size = forecast.getForecastSize();
    for (int i = 1; i <= size; i++) {
        lineChart.addValue(forecast.getForecast((i - 1)), (message + " forecast"), (i + ""));
    }
}