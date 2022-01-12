@java.lang.Override
public java.sql.Timestamp getTimestamp(java.lang.String columnName) throws java.sql.SQLException {
    int index = findColumn(columnName);
    return getTimestamp(index);
}