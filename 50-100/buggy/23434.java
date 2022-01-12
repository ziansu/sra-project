private org.deidentifier.arx.AttributeType.Hierarchy getHierarchy(int column, boolean orderFromDefinition) {
    final java.lang.String attribute = handle.getAttributeName(column);
    final org.deidentifier.arx.AttributeType type = handle.getDefinition().getAttributeType(attribute);
    final org.deidentifier.arx.DataType<?> datatype = handle.getDataType(attribute);
    final org.deidentifier.arx.AttributeType.Hierarchy hierarchy;
    if ((orderFromDefinition && (datatype instanceof org.deidentifier.arx.DataType.ARXString)) && (type instanceof org.deidentifier.arx.AttributeType.Hierarchy)) {
        hierarchy = ((org.deidentifier.arx.AttributeType.Hierarchy) (type));
    }else {
        hierarchy = null;
    }
    return hierarchy;
}