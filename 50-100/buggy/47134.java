@java.lang.Override
public void removeBufferFromFlush(org.opendedup.sdfs.io.DedupChunkInterface writeBuffer) {
    org.opendedup.sdfs.io.DedupChunkInterface _wb = this.flushingBuffers.remove(writeBuffer.getFilePosition());
    if (org.opendedup.logging.SDFSLogger.isDebug()) {
        if ((_wb.hashCode()) != (writeBuffer.hashCode())) {
            org.opendedup.logging.SDFSLogger.getLog().info("on remove hashcodes are not equal");
        }
    }
}