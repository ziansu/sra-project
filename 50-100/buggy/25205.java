public void addPrimitive(java.lang.String name, boolean isNumber) {
    nu.ere.mooddiary.Util.log(Util.LOGLEVEL_1, nu.ere.mooddiary.Database.LOG_PREFIX, "Enter addPrimitive");
    java.lang.String sql = "INSERT INTO EntityPrimitives (name, isNumber) VALUES (?, ?)";
    android.database.sqlite.SQLiteStatement statement = nu.ere.mooddiary.Database.db.compileStatement(sql);
    statement.bindString(1, name);
    statement.bindLong(2, (isNumber ? 1 : 0));
    nu.ere.mooddiary.Util.log(Util.LOGLEVEL_3, nu.ere.mooddiary.Database.LOG_PREFIX, java.lang.String.format("%s: %s, %d", sql, (isNumber ? 1 : 0)));
    statement.executeInsert();
}