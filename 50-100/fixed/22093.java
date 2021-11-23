private long indexUsages(com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx db) {
    final long oldIndexUsage;
    try {
        oldIndexUsage = getProfilerInstance().getCounter((("db." + (com.orientechnologies.orient.core.sql.OCommandExecutorSQLSelectTest.DB_NAME)) + ".query.indexUsed"));
        return oldIndexUsage == (-1) ? 0 : oldIndexUsage;
    } catch (java.lang.Exception e) {
        fail();
    }
    return -1L;
}