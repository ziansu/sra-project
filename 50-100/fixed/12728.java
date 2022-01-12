private boolean isAccessorGroup(java.lang.String accessorName) throws java.sql.SQLException {
    try (java.sql.Statement stmt = jdbcFixture.getConnection().createStatement();java.sql.ResultSet rs = stmt.executeQuery(((("select r_is_group from dm_user" + " where user_name = '") + accessorName) + "'"))) {
        if (rs.next()) {
            return rs.getBoolean(1);
        }
    }
    return false;
}