public boolean accountExist(java.lang.String username) {
    try {
        java.sql.ResultSet rs = stmt.executeQuery((("SELECT * FROM accounts WHERE username = \"" + username) + "\";"));
        return rs.isBeforeFirst();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return false;
}