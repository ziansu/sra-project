private void deleteUrlUserPasswdUnwrapped() throws android.database.sqlite.SQLiteException {
    java.lang.String sql = "DELETE FROM connect";
    com.khallware.apis.Datastore.logger.debug(("sql: " + sql));
    handle().execSQL(sql);
    setTagUnwrapped(0);
}