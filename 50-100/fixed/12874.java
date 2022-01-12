public boolean checkLogin(java.lang.String email, java.lang.String password) {
    password = hashString(password);
    java.lang.String query = "SELECT email, password FROM User WHERE email = ? and password = ? ";
    try {
        java.sql.PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setString(1, email);
        pstmt.setString(2, password);
        java.sql.ResultSet resultSet = pstmt.executeQuery();
        if (resultSet.next()) {
            return true;
        }
    } catch (java.lang.Exception e) {
        printErrorMessage(e, "Login");
    }
    return false;
}