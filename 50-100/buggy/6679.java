private void grow() {
    byte[] old = _buffer;
    _buffer = new byte[(_buffer.length) * 2];
    int pos = _position;
    java.lang.System.arraycopy(old, 0, _buffer, 0, pos);
    _encoder.init(_buffer, pos, ((_buffer.length) * 2));
}