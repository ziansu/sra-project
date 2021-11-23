public boolean GetEmail() {
    android.database.sqlite.SQLiteDatabase reader = dbHelper.getReadableDatabase();
    android.database.Cursor cursor = reader.query(SQLiteDBHelper.TABLE_RCARD, new java.lang.String[]{ sph.durga.rCard.db.SQLiteDBHelper.SQLiteDBHelper.RCARD_EMAIL }, null, null, null, null, null);
    cursor.moveToFirst();
    int cnt = cursor.getCount();
    cursor.close();
    return cnt == 1;
}