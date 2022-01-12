public void setObject(java.sql.CallableStatement statement, com.ctrip.platform.dal.dao.StatementParameter parameter) throws java.sql.SQLException {
    if (((parameter.getValue()) != null) && ((parameter.getSqlType()) == (com.ctrip.platform.dal.common.enums.DatabaseCategory.SQL_SERVER_TYPE_TVP))) {
        com.microsoft.sqlserver.jdbc.SQLServerCallableStatement sqlsvrStatement = ((com.microsoft.sqlserver.jdbc.SQLServerCallableStatement) (statement));
        sqlsvrStatement.setStructured(parameter.getIndex(), parameter.getName(), ((com.microsoft.sqlserver.jdbc.SQLServerDataTable) (parameter.getValue())));
    }else {
        super.setObject(statement, parameter);
    }
}