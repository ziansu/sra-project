public static java.lang.String getStringFromPointable(org.apache.hyracks.data.std.primitive.UTF8StringPointable stringp, org.apache.hyracks.dataflow.common.comm.util.ByteBufferInputStream bbis, java.io.DataInputStream di) throws org.apache.vxquery.exceptions.SystemException {
    try {
        bbis.setByteBuffer(java.nio.ByteBuffer.wrap(java.util.Arrays.copyOfRange(stringp.getByteArray(), stringp.getStartOffset(), ((stringp.getLength()) + (stringp.getStartOffset())))), 0);
        return di.readUTF();
    } catch (java.io.IOException e) {
        throw new org.apache.vxquery.exceptions.SystemException(org.apache.vxquery.exceptions.ErrorCode.SYSE0001, e);
    }
}