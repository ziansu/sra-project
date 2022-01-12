@java.lang.Override
public boolean getBoolean(final int columnIndex) throws java.sql.SQLException {
    verifyRow();
    final java.util.List<com.googlecode.paradox.data.table.value.FieldValue> row = values.get(position);
    if (columnIndex > (row.size())) {
        throw new java.sql.SQLException(com.googlecode.paradox.ParadoxResultSet.ERROR_INVALID_COLUMN, com.googlecode.paradox.utils.SQLStates.INVALID_COLUMN);
    }
    lastValue = row.get((columnIndex - 1));
    return lastValue.isNull() ? false : lastValue.getBoolean().booleanValue();
}