private int getRequestId(java.nio.ByteBuffer buff) {
    int start = 0;
    int offset = java.lang.Integer.BYTES;
    byte[] byteID = new byte[java.lang.Integer.BYTES];
    buff.get(byteID, start, offset);
    java.nio.ByteBuffer wrapped = java.nio.ByteBuffer.wrap(byteID);
    int num = wrapped.getInt();
    return num;
}