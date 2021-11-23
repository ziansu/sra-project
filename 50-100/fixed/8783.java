@android.support.annotation.NonNull
private com.pushtorefresh.storio.sqlitedb.operation.put.PutResult updateOrInsert(@android.support.annotation.NonNull
com.pushtorefresh.storio.sqlitedb.StorIOSQLiteDb storIOSQLiteDb, @android.support.annotation.NonNull
android.content.ContentValues contentValues, @android.support.annotation.NonNull
java.lang.String table, @android.support.annotation.NonNull
java.lang.String idFieldName, @android.support.annotation.NonNull
java.lang.String id) {
    final int numberOfRowsUpdated = storIOSQLiteDb.internal().update(new com.pushtorefresh.storio.sqlitedb.query.UpdateQuery.Builder().table(table).where((idFieldName + "=?")).whereArgs(id).build(), contentValues);
    return numberOfRowsUpdated > 0 ? com.pushtorefresh.storio.sqlitedb.operation.put.PutResult.newUpdateResult(numberOfRowsUpdated, table) : insert(storIOSQLiteDb, contentValues, table);
}