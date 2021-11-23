@java.lang.Override
public long addValue(long delta) {
    return withLock(() -> {
        long value = (bytes.parseLong(((offset) + (net.openhft.chronicle.wire.LongTextReference.VALUE)))) + delta;
        bytes.append(((offset) + (net.openhft.chronicle.wire.LongTextReference.VALUE)), value, 20);
        return value;
    });
}