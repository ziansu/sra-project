@java.lang.Override
public <T> T read(final org.opends.server.backends.pluggable.spi.ReadOperation<T> readOperation) throws java.lang.Exception {
    if (org.opends.server.backends.pluggable.TracedStorage.logger.isTraceEnabled()) {
        return storage.read(new org.opends.server.backends.pluggable.spi.ReadOperation<T>() {
            @java.lang.Override
            public T run(final org.opends.server.backends.pluggable.spi.ReadableStorage txn) throws java.lang.Exception {
                return readOperation.run(new org.opends.server.backends.pluggable.TracedStorage.TracedReadableStorage(txn));
            }
        });
    }
    return storage.read(readOperation);
}