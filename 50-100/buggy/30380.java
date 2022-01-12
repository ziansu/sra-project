@java.lang.Override
public int countStation() {
    io.github.shredktp.trainschedulesrt.data.DbHelper dbHelper = new io.github.shredktp.trainschedulesrt.data.DbHelper(context);
    android.database.sqlite.SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
    java.lang.String queryStation = java.lang.String.format("SELECT * FROM %s", Station.STATION_TABLE_NAME);
    android.database.Cursor cursor = sqLiteDatabase.rawQuery(queryStation, null);
    cursor.moveToFirst();
    int countStation = cursor.getCount();
    cursor.close();
    sqLiteDatabase.close();
    return countStation;
}