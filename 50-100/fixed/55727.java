@java.lang.Override
protected void handleException(final java.lang.String id, final java.lang.String action, final java.nio.channels.WritableByteChannel out, final java.io.IOException e) throws com.github.basking2.jiraffet.JiraffetIOException {
    com.github.basking2.jiraffet.JiraffetTcpIO.LOG.error("Failure {} to {}", action, id, e);
    writableByteChannels.remove(id);
    try {
        out.close();
    } catch (final java.io.IOException e2) {
        com.github.basking2.jiraffet.JiraffetTcpIO.LOG.warn("Failed to close channel to {}: {}", id, e2.getMessage());
    }
}