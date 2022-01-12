@java.lang.Override
public boolean execute() throws java.sql.SQLException {
    checkClosed();
    checkAllArgumentsProvided();
    sqlRequest.args(currentParams);
    executeSingle();
    if (!(hasResultSet(sqlResponse))) {
        return false;
    }
    resultSet = new io.crate.client.jdbc.CrateResultSet(this, sqlResponse);
    return true;
}