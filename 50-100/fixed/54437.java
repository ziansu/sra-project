public static java.math.BigDecimal getBigDecimalFromArrowBuf(io.netty.buffer.ArrowBuf bytebuf, int startIndex, int scale) {
    byte[] value = new byte[org.apache.arrow.vector.util.DecimalUtility.DECIMAL_BYTE_LENGTH];
    bytebuf.getBytes(startIndex, value, 0, org.apache.arrow.vector.util.DecimalUtility.DECIMAL_BYTE_LENGTH);
    java.math.BigInteger unscaledValue = new java.math.BigInteger(value);
    return new java.math.BigDecimal(unscaledValue, scale);
}