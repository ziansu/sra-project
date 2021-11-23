public int createString(java.lang.String s) {
    byte[] utf8 = s.getBytes(flatbuffers.FlatBufferBuilder.utf8charset);
    addByte(((byte) (0)));
    startVector(1, utf8.length);
    java.lang.System.arraycopy(utf8, 0, bb.array(), (space -= utf8.length), utf8.length);
    return endVector();
}