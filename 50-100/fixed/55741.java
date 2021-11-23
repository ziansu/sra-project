@java.lang.Override
public void open(org.apache.flink.core.io.InputSplit ignored) throws java.io.IOException {
    try {
        establishConnection();
        statement = createStatement();
        resultSet = statement.executeQuery(query);
    } catch (java.sql.SQLException se) {
        close();
        throw new java.lang.IllegalArgumentException(("open() failed." + (se.getMessage())), se);
    } catch (java.lang.ClassNotFoundException cnfe) {
        throw new java.lang.IllegalArgumentException(("JDBC-Class not found. - " + (cnfe.getMessage())), cnfe);
    }
}