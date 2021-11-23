@java.lang.Override
public float getFloat(final int columnIndex) throws java.sql.SQLException {
    verifyRow();
    final java.util.List<com.googlecode.paradox.data.table.value.FieldValue> row = values.get(position);
    if (columnIndex > (row.size())) {
        throw new java.sql.SQLException(com.googlecode.paradox.ParadoxResultSet.ERROR_INVALID_COLUMN, SQLStates.INVALID_COLUMN.getValue());
    }
    lastValue = row.get((columnIndex - 1));
    return lastValue.isNull() ? 0.0F : lastValue.getNumber().floatValue();
}