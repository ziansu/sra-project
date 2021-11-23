private static org.apache.avro.Schema getPrimitiveAvroField(org.apache.hive.hcatalog.data.schema.HCatFieldSchema fieldSchema) {
    if (org.schedoscope.export.kafka.avro.HCatToAvroSchemaConverter.primitiveTypeMap.containsKey(fieldSchema.getTypeInfo().getPrimitiveCategory())) {
        org.apache.avro.Schema schema = org.apache.avro.Schema.create(org.schedoscope.export.kafka.avro.HCatToAvroSchemaConverter.primitiveTypeMap.get(fieldSchema.getTypeInfo().getPrimitiveCategory()));
        return org.apache.avro.Schema.createUnion(com.google.common.collect.ImmutableList.of(schema, org.schedoscope.export.kafka.avro.HCatToAvroSchemaConverter.nullSchema));
    }
    throw new java.lang.IllegalArgumentException("can not find primitive type in typeMap");
}