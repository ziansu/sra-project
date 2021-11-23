public static boolean isInteger(org.apache.sqoop.schema.type.Column column) {
    assert column instanceof org.apache.sqoop.schema.type.FixedPoint;
    java.lang.Long byteSize = ((org.apache.sqoop.schema.type.FixedPoint) (column)).getByteSize();
    java.lang.Boolean signed = ((org.apache.sqoop.schema.type.FixedPoint) (column)).isSigned();
    if (byteSize == null) {
        return false;
    }
    if ((signed != null) && (!signed)) {
        byteSize *= 2;
    }
    return byteSize <= ((java.lang.Integer.SIZE) / (java.lang.Byte.SIZE));
}