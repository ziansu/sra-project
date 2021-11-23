public void clear() throws java.sql.SQLException {
    java.lang.String[] sqls = new java.lang.String[]{ "DROP TABLE WORKTIME" , "DROP TABLE MESSAGES" , "DROP TABLE USERS" };
    for (java.lang.String sql : sqls)
        try {
            connection.createStatement().executeUpdate(sql);
            if (debugMode)
                java.lang.System.out.println(sql);
            
        } catch (java.sql.SQLException sqle) {
            java.lang.System.out.println(sqle.getSQLState());
            if ((sqle.getSQLState()) != "42Y55") {
                connection.rollback();
                throw sqle;
            }
        }
    
}