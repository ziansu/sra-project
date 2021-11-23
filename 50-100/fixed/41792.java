static org.apache.avro.Schema toGenericAvroSchema(java.lang.String schemaName, java.util.List<com.google.api.services.bigquery.model.TableFieldSchema> fieldSchemas) {
    java.util.List<org.apache.avro.Schema.Field> avroFields = new java.util.ArrayList<>();
    for (com.google.api.services.bigquery.model.TableFieldSchema bigQueryField : fieldSchemas) {
        avroFields.add(org.apache.beam.sdk.io.gcp.bigquery.BigQueryAvroUtils.convertField(bigQueryField));
    }
    return org.apache.avro.Schema.createRecord(schemaName, ("Translated Avro Schema for " + schemaName), "org.apache.beam.sdk.io.gcp.bigquery", false, avroFields);
}