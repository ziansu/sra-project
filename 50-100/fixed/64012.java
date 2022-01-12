private java.lang.Object getValue(final java.lang.String name, final java.util.EnumSet<com.health.ValueType> types) {
    assert types != null;
    com.health.Column column = this.table.getColumn(name);
    if (column == null) {
        return null;
    }
    if (!(types.contains(column.getType()))) {
        throw new java.lang.IllegalStateException();
    }
    return this.values[column.getIndex()];
}