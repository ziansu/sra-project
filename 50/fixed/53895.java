private void removeFavoriteUnwrapped(int tag) throws android.database.sqlite.SQLiteException {
    java.lang.String sql = "DELETE FROM favorites WHERE tag = " + tag;
    if (tag > 0) {
        com.khallware.apis.Datastore.logger.debug(("sql: " + sql));
        handle().execSQL(sql);
    }
}