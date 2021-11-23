@java.lang.Override
public boolean execute() throws java.sql.SQLException {
    checkClosed();
    checkAllArgumentsProvided();
    sqlRequest.args(currentParams);
    executeSingle();
    resultSet = new io.crate.client.jdbc.CrateResultSet(this, sqlResponse);
    if (!(hasResultSet(sqlResponse))) {
        return false;
    }
    return true;
}