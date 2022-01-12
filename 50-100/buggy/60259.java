public double getSumOfSalaries() throws java.sql.SQLException {
    org.camunda.wf.hiring.dbAccess.DBAccess.getConnection();
    java.sql.Statement state = org.camunda.wf.hiring.dbAccess.DBAccess.connection.createStatement();
    java.lang.String query = "SELECT SUM(potentialSalary) as sum FROM Interview WHERE status = 'accepted'";
    java.sql.ResultSet result = state.executeQuery(query);
    result.next();
    state.close();
    org.camunda.wf.hiring.dbAccess.DBAccess.connection.close();
    return result.getDouble("sum");
}