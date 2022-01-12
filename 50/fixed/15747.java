@java.lang.Override
public void reset() throws java.io.IOException {
    in.reset();
    bytesRead -= bytesSinceMark;
    bytesSinceMark = 0L;
}