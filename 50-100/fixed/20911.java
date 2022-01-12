public static java.lang.String toCSVFloatingPoint(java.lang.Object obj, org.apache.sqoop.schema.type.Column column) {
    assert column instanceof org.apache.sqoop.schema.type.FloatingPoint;
    java.lang.Long byteSize = ((org.apache.sqoop.schema.type.FloatingPoint) (column)).getByteSize();
    if ((byteSize != null) && (byteSize <= ((java.lang.Float.SIZE) / (java.lang.Byte.SIZE)))) {
        return ((java.lang.Float) (obj)).toString();
    }else {
        return ((java.lang.Double) (obj)).toString();
    }
}