public static void add(com.grp8.weatherapp.Data.Database.Database database, int id, int device, java.util.Date timestamp, java.lang.String json) {
    android.content.ContentValues values = new android.content.ContentValues();
    java.text.SimpleDateFormat df = new java.text.SimpleDateFormat(com.grp8.weatherapp.Data.Database.DataReadingDatabaseHelper.DATE_FORMAT);
    values.put(ReadingsTable.COLUMN_ID, id);
    values.put(ReadingsTable.COLUMN_STATION_ID, device);
    values.put(ReadingsTable.COLUMN_TIMESTAMP, df.format(timestamp));
    values.put(ReadingsTable.COLUMN_JSON, json);
    database.insert(ReadingsTable.TABLE_NAME, values);
}