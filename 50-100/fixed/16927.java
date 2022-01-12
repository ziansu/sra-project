private static int queryIntField(java.sql.Connection connection, java.lang.String sql, int unitId) throws java.sql.SQLException {
    java.sql.PreparedStatement ps = connection.prepareStatement(sql);
    ps.setInt(1, unitId);
    java.sql.ResultSet rs = ps.executeQuery();
    return rs.next() ? ((int) (rs.getObject(1))) : -1;
}