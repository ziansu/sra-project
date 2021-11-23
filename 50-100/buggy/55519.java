private void visitChildren(final java.util.List<org.apache.parquet.format.SchemaElement> result, org.apache.parquet.schema.GroupType groupType, org.apache.parquet.format.SchemaElement element) {
    element.setNum_children(groupType.getFieldCount());
    result.add(element);
    for (org.apache.parquet.format.Type field : groupType.getFields()) {
        org.apache.parquet.format.converter.ParquetMetadataConverter.addToList(result, field);
    }
}