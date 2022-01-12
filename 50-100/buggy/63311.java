private void seeder(java.lang.String table, java.lang.String[] values) {
    java.lang.String sql = (("INSERT INTO " + table) + " ") + (preValuesSql(values));
    try {
        exeUpdate(sql);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}