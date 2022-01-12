public int read(byte[] b, int off, int len) throws org.teavm.classlib.java.io.TIOException {
    for (int i = 0; i < len; ++i) {
        int bt = read();
        if (bt < 0) {
            return i == 0 ? -1 : i;
        }
        b[(off++)] = ((byte) (bt));
    }
    return len > 0 ? len : -1;
}