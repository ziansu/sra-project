private java.lang.Object getObject(com.google.cloud.spanner.Type type, java.lang.String columnLabel) throws java.sql.SQLException {
    return getObject(type, ((resultSet.getColumnIndex(columnLabel)) + 1));
}