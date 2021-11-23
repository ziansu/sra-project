private int getRequestId(java.nio.ByteBuffer buff) {
    int start = 0;
    int offset = java.lang.Integer.BYTES;
    byte[] byteID = java.util.Arrays.copyOfRange(buff.array(), start, (start + offset));
    java.nio.ByteBuffer wrapped = java.nio.ByteBuffer.wrap(byteID);
    int num = wrapped.getInt();
    return num;
}