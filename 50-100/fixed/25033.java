public static org.apache.avro.Schema createEnumSchema(org.apache.sqoop.schema.type.Column column) {
    assert column instanceof java.lang.Enum;
    java.util.Set<java.lang.String> options = ((java.lang.Enum) (column)).getOptions();
    java.util.List<java.lang.String> listOptions = new java.util.ArrayList<java.lang.String>(options);
    return org.apache.avro.Schema.createEnum(column.getName(), null, org.apache.sqoop.connector.common.SqoopAvroUtils.SQOOP_SCHEMA_NAMESPACE, listOptions);
}