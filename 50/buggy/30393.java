private void hashAndWrite(final byte[] b, final int l) throws java.io.IOException {
    checksum.update(b, 0, l);
    output.write(b, 0, l);
}