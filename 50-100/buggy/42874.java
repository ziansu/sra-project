public int getRegionNumberByTableName(java.lang.String tableName) {
    int num = -1;
    try {
        java.sql.Connection con = com.adintellig.ella.util.JdbcUtil.getConnection();
        java.sql.Statement stmt = con.createStatement();
        java.sql.ResultSet rs = stmt.executeQuery((("SELECT count(*) FROM hbase.regions where region_name like '" + tableName) + "%'"));
        if (rs.next())
            num = rs.getInt(1);
        
        rs.close();
        stmt.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return num;
}