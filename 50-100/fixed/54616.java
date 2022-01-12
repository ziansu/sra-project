@java.lang.Override
public int read() throws java.io.IOException {
    while ((buffer.remaining()) == 0) {
        if (frameInfo.isFinished()) {
            if (!(nextFrameInfo())) {
                return -1;
            }
        }
        readBlock();
    } 
    return buffer.get();
}