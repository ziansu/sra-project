private synchronized boolean mediaDirExists(java.lang.String path) {
    android.database.Cursor cursor = mDb.query(DIR_TABLE_NAME, new java.lang.String[]{ DIR_ROW_PATH }, ((DIR_ROW_PATH) + "=?"), new java.lang.String[]{ path }, null, null, null);
    boolean exists = cursor.moveToFirst();
    cursor.close();
    return exists;
}