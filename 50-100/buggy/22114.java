protected long writeDatabaseChunk(final int iChunkId, final com.orientechnologies.orient.server.distributed.ODistributedDatabaseChunk chunk, final java.io.FileOutputStream out) throws java.io.IOException {
    com.orientechnologies.orient.server.distributed.ODistributedServerLog.warn(this, getLocalNodeName(), null, DIRECTION.NONE, "- writing chunk #%d offset=%d size=%s", iChunkId, chunk.offset, com.orientechnologies.common.io.OFileUtils.getSizeAsString(chunk.buffer.length));
    out.write(chunk.buffer);
    return chunk.buffer.length;
}