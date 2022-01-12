public static java.lang.Integer lookup(java.sql.Connection remove, java.lang.String s, Database.table t) throws java.sql.SQLException {
    java.lang.Integer result;
    if (s == null)
        return null;
    
    result = media.DBController.tableContainsValue(s, t);
    if (result == null)
        result = media.DBController.tableAddValue(s, t);
    
    return result;
}