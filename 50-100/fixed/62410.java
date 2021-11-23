private com.orientechnologies.orient.core.metadata.schema.OType getFieldType(final com.orientechnologies.orient.core.record.impl.ODocumentEntry entry) {
    com.orientechnologies.orient.core.metadata.schema.OType type = entry.type;
    if (type == null) {
        final com.orientechnologies.orient.core.metadata.schema.OProperty prop = entry.property;
        if (prop != null)
            type = prop.getType();
        
    }
    if ((type == null) || ((com.orientechnologies.orient.core.metadata.schema.OType.ANY) == type))
        type = com.orientechnologies.orient.core.metadata.schema.OType.getTypeByValue(entry.value);
    
    return type;
}