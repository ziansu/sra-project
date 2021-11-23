@com.stormmq.java.classfile.parser.byteReaders.NotNull
@java.lang.Override
public java.nio.ByteBuffer readBytesBuffer(@com.stormmq.java.classfile.parser.byteReaders.NotNull
@com.stormmq.java.classfile.parser.byteReaders.NonNls
final java.lang.String what, final int length) throws java.io.EOFException {
    final byte[] buffer = new byte[length];
    readBytes(what, buffer, length);
    bytesReadSoFar += length;
    return java.nio.ByteBuffer.wrap(buffer);
}