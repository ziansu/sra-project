@java.lang.Override
protected void handleException(final java.lang.String nodeId, final java.lang.String action, final java.nio.channels.WritableByteChannel out, final java.io.IOException e) throws com.github.basking2.jiraffet.JiraffetIOException {
    com.github.basking2.jiraffet.JiraffetTcpIO.LOG.error("Failure {} to {}", action, nodeId, e);
    writableByteChannels.remove(nodeId);
    try {
        out.close();
    } catch (final java.io.IOException e2) {
        com.github.basking2.jiraffet.JiraffetTcpIO.LOG.warn("Failed to close channel to {}: {}", nodeId, e2.getMessage());
    }
}