public boolean insertRealPhoneToken(java.lang.String token) {
    java.lang.String sql = "insert into conn(realtoken, code) values (?, ?) ";
    java.lang.String code = createRandomCode();
    try {
        java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, token);
        preparedStatement.setString(2, code);
    } catch (java.sql.SQLException e) {
        return false;
    }
    return true;
}