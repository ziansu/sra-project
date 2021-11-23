private void grow() {
    byte[] old = _buffer;
    _buffer = new byte[(_buffer.length) * 2];
    java.lang.System.arraycopy(old, 0, _buffer, 0, _position);
    _encoder.init(_buffer, _position, ((_buffer.length) * 2));
}