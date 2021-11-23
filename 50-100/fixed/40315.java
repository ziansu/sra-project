@java.lang.Override
public synchronized void flush() {
    buffer.flip();
    try {
        randomAccessFile.write(buffer.array(), 0, buffer.limit());
        size += buffer.limit();
    } catch (final java.io.IOException ex) {
        final java.lang.String msg = "Error writing to RandomAccessFile " + (getName());
        throw new org.apache.logging.log4j.core.appender.AppenderLoggingException(msg, ex);
    }
    buffer.clear();
}