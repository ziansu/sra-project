public void setBind(android.database.sqlite.SQLiteStatement statement, java.lang.Object ob) throws java.io.IOException, java.lang.IllegalAccessException {
    int n = mTable.getColumnNames().length;
    for (int i = 0; i < n; i++) {
        bind(statement, (i + 1), mTable.getFields().get(i).get(ob));
    }
}