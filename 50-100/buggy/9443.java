int count() throws java.lang.IllegalAccessException {
    android.database.Cursor cursor = buildCount();
    if (cursor == null) {
        throw new java.lang.IllegalAccessException("result has been cosumed, please do a query again.");
    }
    int count = 0;
    if (cursor.moveToFirst())
        count = cursor.getInt(1);
    
    closeCursor(cursor);
    return count;
}