public java.sql.ResultSet executeStatement(java.lang.String sql) throws java.sql.SQLException {
    closeResult();
    if ((conn) == null)
        conn = com.scholastic.sbam.server.database.util.HibernateUtil.getConnection();
    
    java.sql.Statement sqlStmt = conn.createStatement();
    try {
        results = sqlStmt.executeQuery(sql);
    } catch (java.sql.SQLException sqlExc) {
        java.lang.System.out.println(sql);
        java.lang.System.out.println(sqlExc.getMessage());
        sqlExc.printStackTrace();
        throw sqlExc;
    }
    return results;
}