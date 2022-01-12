public void addColumn(java.lang.String name) throws java.sql.SQLException {
    final com.googlecode.paradox.metadata.ParadoxField field = findField(name);
    if (field == null) {
        throw new java.sql.SQLException(java.lang.String.format("Invalid column name: '%s'", name), com.googlecode.paradox.utils.SQLStates.INVALID_COLUMN);
    }
    columns.add(field.getColumn());
}