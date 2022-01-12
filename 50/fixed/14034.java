@java.lang.Override
protected boolean doEmpty() throws java.sql.SQLException {
    return (jdbcTemplate.queryForInt("SELECT COUNT(*) FROM dbc.tables WHERE databasename=?", name)) == 0;
}