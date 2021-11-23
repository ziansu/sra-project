public static java.lang.String getStringFromPointable(org.apache.hyracks.data.std.primitive.UTF8StringPointable stringp, org.apache.hyracks.dataflow.common.comm.util.ByteBufferInputStream bbis, java.io.DataInputStream di) throws java.io.IOException {
    bbis.setByteBuffer(java.nio.ByteBuffer.wrap(java.util.Arrays.copyOfRange(stringp.getByteArray(), stringp.getStartOffset(), ((stringp.getLength()) + (stringp.getStartOffset())))), 0);
    return di.readUTF();
}