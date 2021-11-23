public void cleanTable(java.lang.String tableName) {
    db.execSQL(("delete from " + tableName));
    db.execSQL((("UPDATE SQLITE_SEQUENCE SET SEQ=0 WHERE NAME='" + tableName) + "'"));
}