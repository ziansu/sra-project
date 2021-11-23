@org.jetbrains.annotations.Nullable
private net.openhft.chronicle.map.Work get(net.openhft.lang.io.Bytes reader, net.openhft.chronicle.map.TcpReplicator.TcpSocketChannelEntryWriter writer, final long sizeLocation, long transactionId) {
    bytesMap.output = writer;
    try {
        map.get(reader);
    } catch (java.lang.Throwable e) {
        return sendException(writer, sizeLocation, e);
    } finally {
        bytesMap.output = null;
    }
    writeSizeAndFlags(sizeLocation, false, writer.in());
    return null;
}