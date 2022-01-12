@java.lang.Override
protected boolean onBufferReceived(final java.nio.ByteBuffer buffer) {
    if ((buffer.remaining()) < (kieker.analysis.plugin.reader.tcp.util.SingleSocketRecordReader.INT_BYTES)) {
        return false;
    }
    final int clazzId = buffer.getInt();
    if (clazzId == (-1)) {
        return this.registerRegistryEntry(buffer);
    }else {
        return this.deserializeRecord(clazzId, buffer);
    }
}