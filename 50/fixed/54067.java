private void updatedTimestamp() throws io.hops.exception.StorageException, io.hops.exception.TransactionContextException {
    if (!(previousLogEntries.isEmpty())) {
        io.hops.transaction.EntityManager.findList(MetadataLogEntry.Finder.FETCH_EXISTING, previousLogEntries);
    }
}