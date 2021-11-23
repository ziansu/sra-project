int count() throws java.lang.IllegalAccessException {
    android.database.Cursor cursor = null;
    int count = 0;
    try {
        cursor = buildCount();
        if (cursor == null) {
            throw new java.lang.IllegalAccessException("result has been cosumed, please do a query again.");
        }
        if (cursor.moveToFirst())
            count = cursor.getInt(1);
        
    } finally {
        closeCursor(cursor);
    }
    return count;
}