@java.lang.Override
public android.database.Cursor getStations() throws com.example.alexander_topilskii.internetradio.models.database.NoStationsException {
    android.database.Cursor cursor = db.query(com.example.alexander_topilskii.internetradio.models.database.sqldatabase.SQLDataBaseHelper.TABLE_STATIONS, null, null, null, null, null, null);
    if (cursor != null) {
        cursor.moveToFirst();
        return cursor;
    }else {
        throw new com.example.alexander_topilskii.internetradio.models.database.NoStationsException("Cursor is null");
    }
}