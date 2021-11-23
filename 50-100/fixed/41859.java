private final int _writeBytes(java.io.InputStream in, int bytesLeft) throws java.io.IOException {
    while (bytesLeft > 0) {
        int room = (_outputEnd) - (_outputTail);
        if (room <= 0) {
            _flushBuffer();
            room = (_outputEnd) - (_outputTail);
        }
        int count = in.read(_outputBuffer, _outputTail, room);
        if (count < 0) {
            break;
        }
        _outputTail += count;
        bytesLeft -= count;
    } 
    return bytesLeft;
}