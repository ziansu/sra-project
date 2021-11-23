private java.lang.String[] getValues(org.apache.avro.generic.IndexedRecord record) {
    java.lang.String[] values = new java.lang.String[recordSchema.getFields().size()];
    for (org.apache.avro.Schema.Field field : recordSchema.getFields()) {
        values[field.pos()] = java.lang.String.valueOf(record.get(field.pos()));
    }
    return values;
}