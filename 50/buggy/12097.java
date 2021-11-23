@java.lang.Override
public synchronized void updateObject(java.lang.String columnName, java.lang.Object x, int scale) throws java.sql.SQLException {
    updateObject(findColumn(columnName), x);
}