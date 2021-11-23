public java.util.ArrayList<java.lang.String[]> getNotes(int id) throws java.sql.SQLException {
    java.lang.String tableName = "notes";
    java.lang.String ColumnName = "to_id";
    Manager.DBHelper help = new Manager.DBHelper();
    java.util.ArrayList<java.lang.String[]> result = help.findByColumnNameInt(tableName, ColumnName, id);
    return result;
}