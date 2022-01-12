java.util.List<org.apache.parquet.format.SchemaElement> toParquetSchema(org.apache.parquet.schema.MessageType schema) {
    java.util.List<org.apache.parquet.format.SchemaElement> result = new java.util.ArrayList<org.apache.parquet.format.SchemaElement>();
    addToList(result, schema);
    return result;
}