public static boolean checkDataExistedInTable(java.lang.String tableName) throws java.sql.SQLException {
    java.lang.String check = "SELECT * FROM " + tableName;
    java.sql.PreparedStatement pt = las.DBConnector.conn.prepareStatement(check);
    java.sql.ResultSet rs = pt.executeQuery();
    if (rs.next()) {
        las.DBConnector.truncateBeforeLoad = false;
    }
    return las.DBConnector.truncateBeforeLoad;
}