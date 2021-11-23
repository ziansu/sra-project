public java.lang.String addColumnForTypeConverter(com.raizlabs.android.dbflow.processor.definition.column.ColumnDefinition columnDefinition, com.squareup.javapoet.ClassName typeConverterName) {
    java.util.List<com.raizlabs.android.dbflow.processor.definition.column.ColumnDefinition> columnDefinitions = associatedTypeConverters.get(typeConverterName);
    if (columnDefinitions == null) {
        columnDefinitions = new java.util.ArrayList<>();
    }
    columnDefinitions.add(columnDefinition);
    return "typeConverter" + (typeConverterName.simpleName());
}