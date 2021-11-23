@java.lang.Override
public short getShort(int columnIndex) throws java.sql.SQLException {
    return isNull(columnIndex) ? 0 : ((short) (resultSet.getLong((columnIndex - 1))));
}