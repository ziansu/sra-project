private void write(org.apache.tomcat.util.buf.ByteChunk bc) {
    int length = bc.getLength();
    checkLengthBeforeWrite(length);
    java.lang.System.arraycopy(bc.getBytes(), bc.getStart(), headerBuffer, pos, length);
    pos = (pos) + length;
}