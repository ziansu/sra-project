int readBytes(java.nio.ByteBuffer dst) {
    int size = java.lang.Math.min(((_position) - (_read)), dst.remaining());
    dst.put(_buffer, _read, size);
    _read = (_read) + size;
    if ((_read) == (_position)) {
        _position = 0;
        _read = 0;
    }
    return size;
}