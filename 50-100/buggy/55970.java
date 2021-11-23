@java.lang.Override
public int realReadBytes(byte[] cbuf, int off, int len) throws java.io.IOException {
    if (closed) {
        return -1;
    }
    if ((coyoteRequest) == null) {
        return -1;
    }
    if ((state) == (INITIAL_STATE)) {
        state = BYTE_STATE;
    }
    int result = coyoteRequest.doRead(bb);
    return result;
}