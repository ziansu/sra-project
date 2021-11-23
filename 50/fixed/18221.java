public static net.openhft.chronicle.bytes.NativeStore<java.lang.Void> nativeStore(long capacity) {
    return net.openhft.chronicle.bytes.NativeStore.of(capacity, true, false);
}