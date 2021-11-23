private java.lang.String[] getValues(org.apache.avro.generic.IndexedRecord record) {
    java.lang.String[] values = new java.lang.String[recordSchema.getFields().size()];
    for (org.apache.avro.Schema.Field field : recordSchema.getFields()) {
        java.lang.Object value = record.get(field.pos());
        values[field.pos()] = (value == null) ? null : java.lang.String.valueOf(value);
    }
    return values;
}