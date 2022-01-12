@java.lang.Override
public void setValue(long value) {
    if ((valBuf) == null) {
        valLen = (java.lang.Long.SIZE) / (java.lang.Byte.SIZE);
        valBuf = new byte[valLen];
    }
    java.nio.ByteBuffer tmp = java.nio.ByteBuffer.wrap(valBuf);
    tmp.putLong(value);
}