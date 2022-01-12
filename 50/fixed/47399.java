public static net.openhft.chronicle.bytes.NativeStore<java.lang.Void> lazyNativeStore(long capacity) {
    return net.openhft.chronicle.bytes.NativeStore.of(capacity, false, false);
}