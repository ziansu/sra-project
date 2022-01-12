@java.lang.Override
public void write(final int b) throws java.io.IOException {
    requireNonClosed();
    synchronized(bufferLock) {
        buffer.add(new byte[]{ ((byte) (b)) });
        ++(availableBytes);
        assert !((availableBytes) < 0) : "More memory used as a long can count";
        trim();
    }
    signalModification();
}