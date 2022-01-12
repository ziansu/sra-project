public static boolean isLogicalDate(org.apache.avro.Schema schema) {
    org.apache.avro.LogicalType logicalType = schema.getLogicalType();
    if (logicalType == null) {
        return false;
    }
    org.apache.avro.Schema.Type type = schema.getType();
    java.lang.String logicalTypeName = logicalType.getName();
    return (type == (org.apache.avro.Schema.Type.INT)) && ("date".equals(logicalTypeName));
}