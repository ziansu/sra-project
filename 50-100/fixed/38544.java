public int executeInsertQuery(java.lang.String uuid, byte[] businessRule, int deploymentStatus) throws java.sql.SQLException, org.wso2.carbon.business.rules.core.exceptions.BusinessRulesDatasourceException {
    java.sql.Connection conn = dataSource.getConnection();
    conn.setAutoCommit(true);
    java.sql.PreparedStatement statement = getInsertQuery(conn, uuid, businessRule, deploymentStatus);
    return statement.executeUpdate();
}