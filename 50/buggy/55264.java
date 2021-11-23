@java.lang.Override
public float getFloat(int columnIndex) throws java.sql.SQLException {
    return isNull(columnIndex) ? 0 : ((float) (resultSet.getDouble(columnIndex)));
}