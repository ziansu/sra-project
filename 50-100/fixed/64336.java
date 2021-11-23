private boolean isAscii(int start, int end, io.netty.buffer.DrillBuf buffer) {
    for (int i = start; i < end; i++) {
        byte bb = buffer.getByte(i);
        if (bb < 0) {
            return false;
        }
    }
    return true;
}