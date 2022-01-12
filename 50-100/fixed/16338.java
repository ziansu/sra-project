@java.lang.Override
public int read(java.nio.CharBuffer target) throws java.io.IOException {
    if (!(target.hasRemaining())) {
        return 0;
    }
    if (!(waitForInput())) {
        return org.jline.utils.PumpReader.EOF;
    }
    int count = readBuffer.read(target);
    if ((rewindReadBuffer()) && (target.hasRemaining())) {
        count += readBuffer.read(target);
        rewindReadBuffer();
    }
    return count;
}