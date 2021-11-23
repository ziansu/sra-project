private com.zendesk.maxwell.schema.columndef.ColumnDef findColumn(java.lang.String name) {
    java.lang.String lcName = name.toLowerCase();
    for (com.zendesk.maxwell.schema.columndef.ColumnDef c : columnList) {
        if (c.getName().equals(lcName))
            return c;
        
    }
    return null;
}