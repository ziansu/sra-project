public com.valleycampus.zigbee.io.ByteBuffer put(byte[] src) {
    java.lang.System.arraycopy(src, 0, buffer, ((offset) + (getPosition())), src.length);
    skip(src.length);
    return this;
}