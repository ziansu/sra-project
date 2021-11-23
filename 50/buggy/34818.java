@java.lang.Override
public void set(java.sql.PreparedStatement preparedStatement, int parameterIndex, java.sql.Date value) throws java.sql.SQLException {
    preparedStatement.setDate(parameterIndex, value, com.torodb.backend.converters.sql.DateSqlBinding.CALENDAR);
}