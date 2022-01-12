private java.lang.String getProcessId(java.lang.String title) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.String retString = null;
    java.lang.String sqlstring = ("SELECT ProzesseID FROM prozesse WHERE Titel='" + title) + "'";
    try (java.sql.ResultSet rs = this.stmt.executeQuery(sqlstring)) {
        while (rs.next()) {
            retString = rs.getString("ProzesseID");
        } 
    }
    return retString;
}