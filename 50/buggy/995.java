@java.lang.Override
public int available() throws java.io.IOException {
    poll();
    return readableBytes();
}