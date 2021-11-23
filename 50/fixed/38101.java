public java.sql.ResultSet getUserById(int id) throws java.sql.SQLException {
    help = new Manager.DBHelper();
    return help.findById(tableName, id);
}