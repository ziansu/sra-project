private boolean isAccessorGroup(java.lang.String accessorName) throws java.sql.SQLException {
    java.sql.Statement stmt = null;
    java.sql.ResultSet rs = null;
    try {
        stmt = jdbcFixture.getConnection().createStatement();
        rs = stmt.executeQuery(((("select r_is_group from dm_user" + " where user_name = '") + accessorName) + "'"));
        if (rs.next()) {
            return rs.getBoolean(1);
        }
    } finally {
        rs.close();
        stmt.close();
    }
    return false;
}