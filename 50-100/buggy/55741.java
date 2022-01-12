@java.lang.Override
public void open(org.apache.flink.core.io.InputSplit ignored) throws java.io.IOException {
    try {
        establishConnection();
        statement = dbConn.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE, java.sql.ResultSet.CONCUR_READ_ONLY);
        resultSet = statement.executeQuery(query);
    } catch (java.sql.SQLException se) {
        close();
        throw new java.lang.IllegalArgumentException(("open() failed." + (se.getMessage())), se);
    } catch (java.lang.ClassNotFoundException cnfe) {
        throw new java.lang.IllegalArgumentException(("JDBC-Class not found. - " + (cnfe.getMessage())), cnfe);
    }
}