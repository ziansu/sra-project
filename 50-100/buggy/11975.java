static boolean tableExists(org.jdbdt.CallInfo callInfo, org.jdbdt.DB db, java.lang.String tableName) {
    return db.access(() -> {
        java.sql.DatabaseMetaData dbmd = db.getConnection().getMetaData();
        try (java.sql.ResultSet rs = dbmd.getTables(null, null, null, new java.lang.String[]{ "TABLE" })) {
            while (rs.next()) {
                if (tableName.equalsIgnoreCase(rs.getString("TABLE_NAME"))) {
                    return true;
                }
            } 
        }
        return false;
    });
}