static boolean hasCorrectStructure(android.database.sqlite.SQLiteDatabase database) {
    for (java.lang.String tableName : net.razysoft.production.Contract.tables) {
        if (!(database.query("sqlite_master", new java.lang.String[]{ "name" }, "type='table' AND name=?", new java.lang.String[]{ tableName }, null, null, null).moveToFirst())) {
            return false;
        }
    }
    return true;
}