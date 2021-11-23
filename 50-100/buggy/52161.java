static void assertTableExistence(org.jdbdt.CallInfo callInfo, org.jdbdt.Table table, boolean expected) {
    org.jdbdt.DB db = table.getDB();
    boolean actual = org.jdbdt.DBAssert.tableExists(callInfo, db, table.getName());
    org.jdbdt.SimpleAssertion assertion = new org.jdbdt.SimpleAssertion(table, expected, actual);
    db.log(callInfo, assertion);
    if (!(assertion.passed())) {
        throw new org.jdbdt.DBAssertionError(callInfo.getMessage());
    }
}