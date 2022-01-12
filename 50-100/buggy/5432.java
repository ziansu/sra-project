private void setValue(java.lang.String name, java.lang.Object value, com.health.ValueType type) {
    com.health.Column column = this.table.getColumn(name);
    if (column == null) {
        throw new java.lang.IllegalArgumentException();
    }
    if ((column.getType()) != type) {
        throw new java.lang.IllegalStateException();
    }
    this.values[column.getIndex()] = value;
}