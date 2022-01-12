public long read(final java.nio.ByteBuffer byteBuffer, long bytesToRead, final long offset) {
    int maxBytesReadable = ((int) (java.lang.Math.min(((this.data.capacity()) - offset), bytesToRead)));
    byteBuffer.put(this.data.array(), ((int) (offset)), maxBytesReadable);
    ch.uzh.csg.p2p.group_1.storage.DNFSBlock.LOGGER.debug(java.lang.String.format("Read %d bytes with with offset %d", maxBytesReadable, offset));
    return maxBytesReadable;
}