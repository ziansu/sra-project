@java.lang.SuppressWarnings(value = "SameReturnValue")
@org.jetbrains.annotations.Nullable
private net.openhft.chronicle.map.Work sendException(@org.jetbrains.annotations.NotNull
net.openhft.chronicle.map.TcpReplicator.TcpSocketChannelEntryWriter writer, long sizeLocation, @org.jetbrains.annotations.NotNull
java.lang.Throwable e) {
    writer.in().position((sizeLocation + (net.openhft.chronicle.map.StatelessServerConnector.HEADER_SIZE)));
    writeException(writer, e);
    writeSizeAndFlags(sizeLocation, true, writer.in());
    return null;
}