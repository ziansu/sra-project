@java.lang.Override
public void updateObject(java.lang.String columnName, java.lang.Object x) throws java.sql.SQLException {
    updateObject(findColumn(columnName), x);
}