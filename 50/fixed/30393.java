private void hashAndWrite(final byte[] b, final int l) throws java.io.IOException {
    output.write(b, 0, l);
    checksum.update(b, 0, l);
}