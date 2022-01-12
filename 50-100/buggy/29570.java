@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    android.util.Log.d("Ziolle", "onCreateLoader");
    java.lang.String locationString = com.example.android.sunshine.app.Utility.getPreferredLocation(getActivity());
    java.lang.String sortOrder = (WeatherContract.WeatherEntry.COLUMN_DATE) + " ASC";
    android.net.Uri weatherForLocationUri = WeatherContract.WeatherEntry.buildWeatherLocationWithStartDate(locationString, java.lang.System.currentTimeMillis());
    com.example.android.sunshine.app.ForecastFragment.mCursorLoader = new android.support.v4.content.CursorLoader(getActivity(), weatherForLocationUri, com.example.android.sunshine.app.ForecastFragment.FORECAST_COLUMNS, null, null, sortOrder);
    return com.example.android.sunshine.app.ForecastFragment.mCursorLoader;
}