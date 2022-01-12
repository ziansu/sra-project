public static int lookup(java.sql.Connection conn, java.lang.String s, Database.table t) throws java.sql.SQLException {
    int result;
    result = media.DBController.tableContainsValue(conn, s, t);
    if (result == 0)
        result = media.DBController.tableAddValue(conn, s, t);
    
    return result;
}