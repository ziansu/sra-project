@java.lang.Override
public java.lang.Integer execute(java.sql.Connection conn) throws java.sql.SQLException {
    java.sql.PreparedStatement stmt = null;
    java.sql.ResultSet resultSet = null;
    try {
        stmt = conn.prepareStatement(("insert into messages (message_text) " + " values(?)"));
        stmt.setString(1, text);
        stmt.executeUpdate();
        resultSet = stmt.executeQuery();
        return 1;
    } finally {
        persist.DBUtil.closeQuietly(resultSet);
        persist.DBUtil.closeQuietly(stmt);
    }
}