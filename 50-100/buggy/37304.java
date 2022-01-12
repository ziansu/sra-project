protected java.sql.ResultSet queryByReferenceID(java.lang.String tableName, java.lang.String referenceID, int referenceValue) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.sql.PreparedStatement stmt = null;
    java.sql.ResultSet rs = null;
    stmt = con.prepareStatement((((("SELECT * FROM " + tableName) + " WHERE ") + referenceID) + " = ?"));
    stmt.setInt(1, referenceValue);
    rs = stmt.executeQuery();
    rs.next();
    return rs;
}