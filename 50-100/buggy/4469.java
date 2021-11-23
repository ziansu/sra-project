@java.lang.Override
public boolean compareAndSwapValue(int expected, int value) {
    return withLock(() -> {
        if ((bytes.parseLong(((offset) + (net.openhft.chronicle.wire.IntTextReference.VALUE)))) == expected) {
            bytes.append(((offset) + (net.openhft.chronicle.wire.IntTextReference.VALUE)), value, 10);
            return true;
        }
        return false;
    });
}