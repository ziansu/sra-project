static net.openhft.chronicle.map.ChronicleMap<byte[], byte[]> newByteArrayMap() throws java.io.IOException {
    final net.openhft.chronicle.engine.map.WireRemoteStatelessClientTest.RemoteMapSupplier remoteMapSupplier = new net.openhft.chronicle.engine.map.WireRemoteStatelessClientTest.RemoteMapSupplier(byte[].class, byte[].class);
    return remoteMapSupplier.get();
}