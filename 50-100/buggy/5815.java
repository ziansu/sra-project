private void seeder(java.lang.String table, java.lang.String[] values, java.lang.Boolean isAutoInternational) {
    java.lang.String sql = (("INSERT INTO " + table) + " ") + (preValuesSql(values, isAutoInternational));
    show(sql);
    try {
        exeUpdate(sql);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        java.lang.System.exit(1);
    }
}