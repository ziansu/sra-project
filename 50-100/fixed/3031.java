org.apache.parquet.schema.MessageType fromParquetSchema(java.util.List<org.apache.parquet.format.SchemaElement> schema) {
    java.util.Iterator<org.apache.parquet.format.SchemaElement> iterator = schema.iterator();
    org.apache.parquet.format.SchemaElement root = iterator.next();
    org.apache.parquet.schema.Types.MessageTypeBuilder builder = org.apache.parquet.schema.Types.buildMessage();
    buildChildren(builder, iterator, root.getNum_children());
    return builder.named(root.name);
}