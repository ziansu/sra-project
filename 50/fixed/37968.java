@java.lang.Override
public java.sql.ResultSet execute() throws java.sql.SQLException {
    java.lang.String query = prepareQuery();
    dbManager.getStatement().execute(query);
    return null;
}