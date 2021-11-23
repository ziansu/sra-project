@java.lang.Override
public java.sql.Date get(java.sql.ResultSet resultSet, int columnIndex) throws java.sql.SQLException {
    java.sql.Date value = resultSet.getDate(columnIndex, com.torodb.backend.converters.sql.DateSqlBinding.CALENDAR);
    if (resultSet.wasNull()) {
        return null;
    }
    return value;
}