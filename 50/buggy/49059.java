public java.util.ArrayList<java.lang.String[]> getUserByEmail(java.lang.String email) throws java.sql.SQLException {
    java.lang.String columnName = "email";
    Manager.DBHelper help = new Manager.DBHelper();
    return help.findByColumnName(tableName, columnName, email);
}