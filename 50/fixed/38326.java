public void assertCall(java.lang.String sqlQuery, ru.proxima.commons.db.CallableCallback cFactory, ru.proxima.commons.db.CallableCallback afterExec) throws java.lang.RuntimeException {
    try {
        callQuery(sqlQuery, cFactory, afterExec);
    } catch (java.sql.SQLException ex) {
        throw new java.lang.RuntimeException(ex);
    }
}