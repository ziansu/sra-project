@java.lang.Override
public void open() {
    try {
        java.lang.Class.forName(amazon_product_metadata_parser.output.SQLServer2012.SQLServer2012Output.SQL_SERVER_DRIVER_CLASS_NAME);
        conn = java.sql.DriverManager.getConnection(serverUrl);
        java.lang.System.out.println((("Connected to SQL Server Database '" + (databaseName)) + "'"));
        statementsToExecute.setConn(conn);
        statementsToExecute.executeBeforeStatements();
        updateCounts();
    } catch (java.lang.ClassNotFoundException | java.sql.SQLException e) {
        throw new amazon_product_metadata_parser.output.ProductOutputException(e);
    }
}