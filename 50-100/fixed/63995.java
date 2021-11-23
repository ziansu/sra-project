private void updateRecordIntoDatabase(final com.claudiodegio.dbsync.core.SqlLiteManager.DBRecordMatch dbRecordMatch, final com.claudiodegio.dbsync.TableToSync tableToSync, final com.claudiodegio.dbsync.core.Record record) {
    android.content.ContentValues contentValues;
    java.lang.String whereClause;
    contentValues = buildContentValues(tableToSync, record);
    whereClause = (tableToSync.getIdColumn()) + " = ?";
    int count = mDB.update(tableToSync.getName(), contentValues, whereClause, new java.lang.String[]{ java.lang.Long.toString(dbRecordMatch.getId()) });
}