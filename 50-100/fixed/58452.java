@java.lang.Override
public long addStation(java.lang.String name) {
    io.github.shredktp.trainschedulesrt.data.DbHelper dbHelper = new io.github.shredktp.trainschedulesrt.data.DbHelper(context);
    android.database.sqlite.SQLiteDatabase sqLiteDatabase = dbHelper.getWritableDatabase();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(Station.Column.NAME, name);
    contentValues.put(Station.Column.LINE, "");
    long result = sqLiteDatabase.insert(Station.STATION_TABLE_NAME, null, contentValues);
    sqLiteDatabase.close();
    dbHelper.close();
    return result;
}