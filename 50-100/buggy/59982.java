@java.lang.Override
public void write(final org.opends.server.backends.pluggable.spi.WriteOperation writeOperation) throws java.lang.Exception {
    if (org.opends.server.backends.pluggable.TracedStorage.logger.isTraceEnabled()) {
        storage.write(new org.opends.server.backends.pluggable.spi.WriteOperation() {
            @java.lang.Override
            public void run(final org.opends.server.backends.pluggable.spi.WriteableStorage txn) throws java.lang.Exception {
                writeOperation.run(new org.opends.server.backends.pluggable.TracedStorage.TracedWriteableStorage(txn));
            }
        });
    }
    storage.write(writeOperation);
}