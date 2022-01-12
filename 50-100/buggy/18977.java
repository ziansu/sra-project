public <T> int update(java.lang.Class<T> classTable, android.content.ContentValues contentValues, java.lang.String whereClause, java.lang.String[] whereParams, java.lang.String having, java.lang.String limit) {
    istat.android.data.access.sqlite.SQLiteUpdate.Updater update = update(classTable).updater;
    update.model.fillFromContentValues(contentValues);
    update.whereClause = new java.lang.StringBuilder(whereClause);
    update.whereParams = (whereParams != null) ? java.util.Arrays.asList(whereParams) : null;
    update.limit = limit;
    update.having = new java.lang.StringBuilder(having);
    return update.execute();
}