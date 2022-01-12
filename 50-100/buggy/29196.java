public static java.lang.Object toFloatingPoint(java.lang.String csvString, org.apache.sqoop.schema.type.Column column) {
    java.lang.Object returnValue;
    java.lang.Long byteSize = ((org.apache.sqoop.schema.type.FloatingPoint) (column)).getByteSize();
    if ((byteSize != null) && (byteSize <= ((java.lang.Float.SIZE) / (java.lang.Byte.SIZE)))) {
        returnValue = java.lang.Float.valueOf(csvString);
    }else {
        returnValue = java.lang.Double.valueOf(csvString);
    }
    return returnValue;
}