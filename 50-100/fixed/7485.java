@java.lang.Override
public boolean compareAndSwapValue(long expected, long value) {
    return withLock(() -> {
        if ((bytes.parseLong(((offset) + (net.openhft.chronicle.wire.LongTextReference.VALUE)))) == expected) {
            bytes.append(((offset) + (net.openhft.chronicle.wire.LongTextReference.VALUE)), value);
            return true;
        }
        return false;
    });
}