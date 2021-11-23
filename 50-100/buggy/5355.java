public com.example.alex.weatheraarhusgroup03.WeatherInfo getLatestWeatherInfo() {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    java.lang.String selectQuery = ((("SELECT  * FROM " + (WeatherInfoTableContract.WeatherInfoTable.TABLE_NAME)) + " ORDER BY ") + (WeatherInfoTableContract.WeatherInfoTable.COLUMN_TIMESTAMP)) + " DESC LIMIT 1";
    android.util.Log.e(com.example.alex.weatheraarhusgroup03.DatabaseHelper.LOG, selectQuery);
    android.database.Cursor cursor = db.rawQuery(selectQuery, null);
    java.util.ArrayList<com.example.alex.weatheraarhusgroup03.WeatherInfo> infos = getWeatherInfoFromCursor(cursor);
    com.example.alex.weatheraarhusgroup03.WeatherInfo weatherInfo = infos.get(0);
    return weatherInfo;
}