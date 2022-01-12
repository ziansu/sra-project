private long getLong(android.database.Cursor cursor, java.lang.String column) {
    int index = cursor.getColumnIndex(column);
    return cursor.getLong(index);
}