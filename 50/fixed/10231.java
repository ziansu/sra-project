static net.openhft.chronicle.map.ChronicleMap<java.lang.CharSequence, java.lang.CharSequence> newStrStrMap() throws java.io.IOException {
    final net.openhft.chronicle.engine.map.WireRemoteStatelessClientTest.RemoteMapSupplier remoteMapSupplier = new net.openhft.chronicle.engine.map.WireRemoteStatelessClientTest.RemoteMapSupplier(java.lang.CharSequence.class, java.lang.CharSequence.class);
    return remoteMapSupplier.get();
}