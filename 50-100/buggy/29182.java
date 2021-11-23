@java.lang.Override
public int addValue(int delta) {
    return withLock(() -> {
        long value = (bytes.parseLong(((offset) + (net.openhft.chronicle.wire.IntTextReference.VALUE)))) + delta;
        bytes.append(((offset) + (net.openhft.chronicle.wire.IntTextReference.VALUE)), value, 10);
        return ((int) (value));
    });
}