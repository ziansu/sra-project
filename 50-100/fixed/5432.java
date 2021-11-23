private void setValue(final java.lang.String name, final java.lang.Object value, final com.health.ValueType type) {
    assert type != null;
    com.health.Column column = this.table.getColumn(name);
    if (column == null) {
        throw new java.lang.IllegalArgumentException();
    }
    if ((column.getType()) != type) {
        throw new java.lang.IllegalStateException();
    }
    this.values[column.getIndex()] = value;
}