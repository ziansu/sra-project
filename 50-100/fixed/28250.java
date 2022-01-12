private com.netflix.astyanax.model.Column<java.util.UUID> astyanaxColumn(java.util.UUID uuidValue, java.lang.String value) {
    com.netflix.astyanax.model.Column<java.util.UUID> column = org.mockito.Mockito.mock(com.netflix.astyanax.model.Column.class);
    org.mockito.Mockito.when(column.getName()).thenReturn(uuidValue);
    org.mockito.Mockito.when(column.getStringValue()).thenReturn(value);
    return column;
}