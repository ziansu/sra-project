public int read(java.io.InputStream in, int offset, int byteCount) throws java.io.IOException {
    if ((offset + byteCount) > (_bytes.length)) {
        byte[] newBytes = new byte[byteCount + offset];
        java.lang.System.arraycopy(_bytes, 0, newBytes, 0, _bytes.length);
        _bytes = newBytes;
    }
    _size = in.read(_bytes, offset, byteCount);
    return _size;
}