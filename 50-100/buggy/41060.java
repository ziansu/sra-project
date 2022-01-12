static long insertNorthPoleLocationValues(android.content.Context context) {
    com.example.julian.sunshine.app.data.WeatherDbHelper dbHelper = new com.example.julian.sunshine.app.data.WeatherDbHelper(context);
    android.database.sqlite.SQLiteDatabase db = dbHelper.getWritableDatabase();
    android.content.ContentValues testValues = com.example.julian.sunshine.app.data.TestUtilities.createNorthPoleLocationValues();
    long locationRowId;
    locationRowId = db.insert(WeatherContract.LocationEntry.TABLE_NAME, null, testValues);
    assertTrue("Error: Failure to insert North Pole Location Values", (locationRowId != (-1)));
    return locationRowId;
}