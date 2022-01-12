@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int i, android.os.Bundle bundle) {
    java.lang.String locationSetting = com.example.mshukla.cloudy.Utility.getPreferredLocation(getActivity());
    java.lang.String sortOrder = (WeatherContract.WeatherEntry.COLUMN_DATE) + " ASC";
    android.net.Uri weatherForLocationUri = WeatherContract.WeatherEntry.buildWeatherLocationWithStartDate(locationSetting, java.lang.System.currentTimeMillis());
    return new android.support.v4.content.CursorLoader(getActivity(), weatherForLocationUri, com.example.mshukla.cloudy.ForecastFragment.FORECAST_COLUMNS, null, null, sortOrder);
}