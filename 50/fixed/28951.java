private static boolean checkPassword(java.lang.String _username, java.lang.String _password) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    return Tools.BCrypt.checkpw(_password, MySQL.Login.selectUsernameFromDatabase(_username));
}