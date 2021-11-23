@java.lang.Override
public int read() throws java.io.IOException {
    if (frameInfo.isFinished()) {
        if (!(nextFrameInfo())) {
            return -1;
        }
    }
    if ((buffer.remaining()) == 0) {
        readBlock();
    }
    if (frameInfo.isFinished()) {
        return read();
    }
    return buffer.get();
}