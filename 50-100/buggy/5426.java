public boolean resetCode(java.lang.String token) {
    if ((isTokenRegister(token)) == false) {
        return false;
    }
    java.lang.String code = createRandomCode();
    java.lang.String sql = ((("update conn set code = '" + code) + "' where realtoken = '") + token) + "'";
    try {
        java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.execute();
    } catch (java.sql.SQLException e) {
        return false;
    }
    return true;
}