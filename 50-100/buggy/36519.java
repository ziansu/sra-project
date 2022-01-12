public static void readOperation(com.orientechnologies.orient.core.db.ODatabase database, int n) throws java.lang.Exception {
    java.lang.String query = java.lang.String.format("SELECT FROM %s WHERE name = ?", OConstants.CLASS_NAME);
    java.util.List<com.orientechnologies.orient.core.record.impl.ODocument> result = database.command(new com.orientechnologies.orient.core.sql.query.OSQLSynchQuery(query)).execute(com.orientechnologies.orient.stresstest.util.ODatabaseUtils.getThreadValue(n));
    if ((result.size()) != 1) {
        throw new java.lang.Exception(java.lang.String.format("The query [%s] result size is %d. Expected size is 1.", query, result.size()));
    }
}