public static java.lang.String serializeAsUTC(java.sql.Timestamp ts) {
    return org.openx.data.jsonserde.objectinspector.primitive.ParsePrimitiveUtils.UTC_FORMAT.format(((ts.getTime()) - (org.openx.data.jsonserde.objectinspector.primitive.ParsePrimitiveUtils.defaultZone.getOffset(ts.getTime()))));
}