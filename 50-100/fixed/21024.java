public void releaseSeqLock(java.sql.Connection con, java.lang.String lockName) {
    java.lang.String insertSeq = ("insert into seqLock values ( '" + lockName) + "' )";
    java.sql.Statement stmt = null;
    try {
        stmt = con.createStatement();
        stmt.executeUpdate(insertSeq);
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException(("Error: Problem executing: " + insertSeq), e);
    }
}