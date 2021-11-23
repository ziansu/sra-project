@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int i, android.os.Bundle bundle) {
    java.lang.String locationSetting = com.example.android.sunshine.app.Utility.getPreferredLocation(getActivity());
    java.lang.String sortOrder = (WeatherContract.WeatherEntry.COLUMN_DATE) + " ASC";
    android.net.Uri weatherForLocationUri = WeatherContract.WeatherEntry.buildWeatherLocationWithStartDate(locationSetting, java.lang.System.currentTimeMillis());
    java.lang.System.out.println(("the columus" + (com.example.android.sunshine.app.ForecastFragment.FORECAST_COLUMNS)));
    return new android.support.v4.content.CursorLoader(getActivity(), weatherForLocationUri, com.example.android.sunshine.app.ForecastFragment.FORECAST_COLUMNS, null, null, sortOrder);
}