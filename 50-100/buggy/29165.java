public android.database.Cursor query(android.database.sqlite.SQLiteDatabase db, java.lang.String[] columns, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy, java.lang.String limit) {
    assertTable();
    if (columns != null)
        mapColumns(columns);
    
    return db.query(mTable, columns, getSelection(), getSelectionArgs(), groupBy, having, orderBy, limit);
}