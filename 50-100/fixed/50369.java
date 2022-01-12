@java.lang.Override
public int read(char[] cbuf, int off, int len) throws java.io.IOException {
    int n = _in.read(cbuf, off, len);
    for (int i = off; i < (off + len); i++) {
        cbuf[i] = _decryption.decryptChar(cbuf[i]);
    }
    return n;
}