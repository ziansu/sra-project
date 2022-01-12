@java.lang.Override
public int read() throws java.io.IOException {
    int bytesRead = read(smallBuffer, 0, 1);
    if (bytesRead > 0) {
        return ((int) ((smallBuffer[0]) & 255));
    }else {
        smallBuffer[0] = ((byte) (0));
        return -1;
    }
}