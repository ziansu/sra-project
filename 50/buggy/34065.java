protected int getIncompleteBandsCount(int dbUpdateInterval) throws java.lang.Exception {
    java.sql.ResultSet resSet = executeQuery(getStmtIncompleteBandsCount(), new java.sql.Timestamp(java.lang.System.currentTimeMillis()), dbUpdateInterval);
    return resSet.next() ? resSet.getInt(1) : 0;
}