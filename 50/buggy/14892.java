public void printByteBuffer(java.nio.ByteBuffer buf) {
    for (int i = 0; i < (buf.limit()); i++) {
        java.lang.System.out.println(java.lang.String.format("Position: %s: %s", i, buf.get(i)));
    }
}