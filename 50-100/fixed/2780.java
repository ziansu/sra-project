@java.lang.Override
public android.support.v4.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    java.lang.String sortOrder = (WeatherContract.WeatherEntry.COLUMN_DATE) + " ASC";
    java.lang.String locationSetting = com.jongor_software.android.sunshine.Utility.getPreferredLocation(getActivity());
    android.net.Uri weatherForLocationUri = WeatherContract.WeatherEntry.buildWeatherLocationWithStartDate(locationSetting, java.lang.System.currentTimeMillis());
    return new android.support.v4.content.CursorLoader(getActivity(), weatherForLocationUri, com.jongor_software.android.sunshine.ForecastFragment.FORECAST_COLUMNS, null, null, sortOrder);
}