@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.lang.String[]> loader, java.lang.String[] data) {
    mRefreshProgressBar.setVisibility(View.INVISIBLE);
    mForecastAdapter.setWeatherData(data);
    if (data != null) {
        showForecast();
    }else {
        showErrorMessage();
    }
}