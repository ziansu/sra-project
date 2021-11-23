private org.talend.core.model.metadata.IMetadataTable mockMetadataTable(java.lang.String label) {
    org.talend.core.model.metadata.IMetadataTable table = mock(org.talend.core.model.metadata.IMetadataTable.class);
    when(table.getLabel()).thenReturn(label);
    java.util.List<org.talend.core.model.metadata.IMetadataColumn> columns = new java.util.ArrayList<org.talend.core.model.metadata.IMetadataColumn>();
    when(table.getListColumns()).thenReturn(columns);
    return table;
}