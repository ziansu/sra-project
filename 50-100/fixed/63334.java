@java.lang.Override
public int read(byte[] buffer, int byteOffset, int byteCount) throws java.io.IOException {
    byteCount = java.lang.Math.min((((end) + 1) - (pos)), byteCount);
    if (byteCount > 0) {
        int bytesRead = in.read(buffer, byteOffset, byteCount);
        pos += bytesRead;
        return bytesRead;
    }else {
        return -1;
    }
}