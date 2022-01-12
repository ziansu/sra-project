@java.lang.Override
public void visit(org.apache.parquet.schema.GroupType groupType) {
    org.apache.parquet.format.SchemaElement element = new org.apache.parquet.format.SchemaElement(groupType.getName());
    element.setRepetition_type(org.apache.parquet.format.converter.ParquetMetadataConverter.toParquetRepetition(groupType.getRepetition()));
    if ((groupType.getOriginalType()) != null) {
        element.setConverted_type(org.apache.parquet.format.converter.ParquetMetadataConverter.getConvertedType(groupType.getOriginalType()));
    }
    visitChildren(result, groupType, element);
}