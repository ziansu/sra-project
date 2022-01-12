@java.lang.Override
public void get(byte[] dest, int offset, int length) {
    int moved = 0;
    while (moved < length) {
        int toRead = java.lang.Math.min((length - moved), currentBuffer.remaining());
        currentBuffer.get(dest, offset, toRead);
        moved += toRead;
        updateCurrentBuffer();
    } 
    _pos += moved;
}