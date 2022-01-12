@java.lang.Override
public java.math.BigDecimal fromBytes(java.nio.ByteBuffer value, org.apache.avro.Schema schema, org.apache.avro.LogicalType type) {
    int scale = ((org.apache.avro.LogicalTypes.Decimal) (type)).getScale();
    byte[] bytes = value.get(new byte[value.remaining()]).array();
    return new java.math.BigDecimal(new java.math.BigInteger(bytes), scale);
}