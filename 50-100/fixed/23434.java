private java.lang.String[][] getHierarchy(int column, boolean orderFromDefinition) {
    final java.lang.String attribute = handle.getAttributeName(column);
    final java.lang.String[][] hierarchy = handle.getDefinition().getHierarchy(attribute);
    final org.deidentifier.arx.DataType<?> datatype = handle.getDataType(attribute);
    if ((orderFromDefinition && (datatype instanceof org.deidentifier.arx.DataType.ARXString)) && (hierarchy != null)) {
        return hierarchy;
    }else {
        return null;
    }
}