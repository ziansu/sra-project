public static boolean CustomerWithEmailExists(java.lang.String email) throws java.sql.SQLException {
    java.lang.String query = "SELECT count(*) as count FROM customers WHERE email=?";
    java.sql.Connection connection = data.ConnectionProviderMockup.getConnection();
    java.sql.PreparedStatement statement = connection.prepareStatement(query);
    statement.setString(1, email);
    java.sql.ResultSet rs = statement.executeQuery();
    if (rs.next()) {
        int c = rs.getInt("count");
        return c > 0;
    }
    return false;
}