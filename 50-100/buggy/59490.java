@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.lang.String[]> loader, java.lang.String[] data) {
    mRefreshProgressBar.setVisibility(View.INVISIBLE);
    if (data != null) {
        showForecast();
        mForecastAdapter.setWeatherData(data);
    }else {
        showErrorMessage();
    }
}