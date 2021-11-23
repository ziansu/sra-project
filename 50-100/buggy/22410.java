@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    mForecastAdapter.swapCursor(data);
    if ((mPosition) == (android.support.v7.widget.RecyclerView.NO_POSITION))
        mPosition = 0;
    
    mRecyclerView.smoothScrollToPosition(mPosition);
    if ((data.getCount()) != 0)
        showWeatherDataView();
    
    android.net.Uri todayForecastUri = android.content.ContentUris.withAppendedId(forecastQueryUri, 1);
    sendForecastToWearable(todayForecastUri);
}