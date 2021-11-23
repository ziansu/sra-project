@java.lang.Override
public long insertData(java.lang.String tableName, android.content.ContentValues contentValues) {
    long id = -1;
    android.database.sqlite.SQLiteDatabase database = null;
    try {
        database = mDbOpenHelper.getWritableDatabase();
        id = database.insert(tableName, null, contentValues);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        if (database != null)
            database.close();
        
    }
    return id;
}