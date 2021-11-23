private java.lang.Object getValue(java.lang.String name, java.util.EnumSet<com.health.ValueType> types) {
    com.health.Column column = this.table.getColumn(name);
    if (column == null) {
        return null;
    }
    if (!(types.contains(column.getType()))) {
        throw new java.lang.IllegalStateException();
    }
    return this.values[column.getIndex()];
}