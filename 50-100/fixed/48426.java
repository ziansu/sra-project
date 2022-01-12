@java.lang.Override
public boolean isReadOnly() {
    synchronized(readOnly) {
        final long freeSpace = dataLock.getFile().toFile().getUsableSpace();
        if (freeSpace < (diskSpaceMin)) {
            org.exist.storage.BrokerPool.LOG.fatal(((("Partition containing DATA_DIR: " + (dataLock.getFile().toAbsolutePath().toString())) + " is running out of disk space. ") + "Switching eXist-db to read only to prevent data loss!"));
            setReadOnly();
        }
        return readOnly;
    }
}