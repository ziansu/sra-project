private static java.lang.String slug() {
    java.util.UUID uuid = java.util.UUID.randomUUID();
    long hi = uuid.getMostSignificantBits();
    long lo = uuid.getLeastSignificantBits();
    java.nio.ByteBuffer raw = java.nio.ByteBuffer.allocate(16);
    raw.putLong(hi);
    raw.putLong(lo);
    byte[] rawBytes = raw.array();
    return net.iharder.Base64.encodeBytes(rawBytes).replace('+', '-').replace('/', '_').substring(0, 22);
}