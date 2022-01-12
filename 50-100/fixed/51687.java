private int printOptions() throws java.sql.SQLException {
    com.mysql.jdbc.DatabaseMetaData meta = ((com.mysql.jdbc.DatabaseMetaData) (myConnection.getMetaData()));
    java.sql.ResultSet res = meta.getTables(null, null, null, new java.lang.String[]{ "TABLE" });
    int i = 0;
    while (res.next()) {
        java.lang.System.out.println((((i + 1) + ". \t") + (res.getString(3))));
        i++;
    } 
    res.close();
    return i;
}