public static boolean isLogicalDate(org.apache.avro.Schema schema) {
    org.apache.avro.LogicalType logicalType = schema.getLogicalType();
    if (logicalType == null) {
        return false;
    }
    return ((org.apache.avro.Schema.Type.INT) == (schema.getType())) && ("date".equals(logicalType.getName()));
}