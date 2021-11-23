public void setCurrentCursor(android.database.Cursor cursor) {
    if ((cursor != null) && ((cursor.getCount()) > 0)) {
        currentCursor = cursor;
        if ((currentPage) == (com.gautamastudios.whatweather.ui.adapter.WeatherViewPageAdapter.WeatherPage.TODAY)) {
            updateCurrentWeather(currentViewGroup);
        }
    }
}