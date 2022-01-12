public static void add(com.grp8.weatherapp.Data.Database.Database database, int id, int device, java.util.Date timestamp, java.lang.String json) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(ReadingsTable.COLUMN_ID, id);
    values.put(ReadingsTable.COLUMN_STATION_ID, device);
    values.put(ReadingsTable.COLUMN_TIMESTAMP, timestamp.getTime());
    values.put(ReadingsTable.COLUMN_JSON, json);
    database.insert(ReadingsTable.TABLE_NAME, values);
}