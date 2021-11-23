private void bindInsertStatementArgs(android.database.sqlite.SQLiteStatement statement, java.lang.Object object) {
    int inc = ((id) == null) ? 1 : 0;
    try {
        for (net.qiushao.lib.dbhelper.ColumnInfo column : columns) {
            column.type.bindArg(statement, ((column.index) + inc), column.field.get(object));
        }
    } catch (java.lang.IllegalAccessException e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException(e);
    }
}