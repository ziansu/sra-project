@java.lang.Override
public void setRowValue(int columnIndex, java.lang.Object value) {
    if (columnIndex != 0) {
        throw new java.lang.IllegalArgumentException(("Expected column index 0, got: " + columnIndex));
    }
    if (this.valueDefined) {
        throw new java.lang.IllegalStateException("Attempted to set the list row twice.");
    }
    this.valueDefined = true;
    this.value = value;
}