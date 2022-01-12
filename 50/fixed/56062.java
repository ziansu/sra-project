private void writeChars(java.lang.String chars) {
    java.nio.ByteOrder order = buffer.getByteOrder();
    buffer.setByteOrder(java.nio.ByteOrder.LITTLE_ENDIAN);
    buffer.putChars(chars);
    buffer.setByteOrder(order);
}