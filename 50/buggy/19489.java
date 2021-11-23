@java.lang.Override
public java.lang.Class<?> getColumnClass(final int columnIndex) {
    if (columnIndex < 2) {
        return java.lang.String.class;
    }
    return java.lang.Long.class;
}