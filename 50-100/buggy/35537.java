public org.morningstarcc.morningstarapp.database.DatabaseReadBuffer read(@android.support.annotation.Nullable
java.lang.String[] columns, java.lang.String where, java.lang.String[] whereArgs) {
    android.database.sqlite.SQLiteDatabase db = databaseHandler.getReadableDatabase();
    android.database.Cursor values = null;
    if (exists(db))
        values = read(db, columns, where, whereArgs);
    
    return new org.morningstarcc.morningstarapp.database.DatabaseReadBuffer(values);
}