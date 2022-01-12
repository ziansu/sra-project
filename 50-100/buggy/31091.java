public <R extends org.neo4j.kernel.impl.store.record.AbstractBaseRecord> long loadRecords(int recordsPerPage, long highestRecordId, org.neo4j.kernel.impl.store.RecordStore<R> recordStore, R record) {
    long pages = 0;
    for (int id = 0; id <= highestRecordId; id += recordsPerPage) {
        if ((pages % 100000) == 0) {
            if (apoc.util.Util.transactionIsTerminated(db))
                return pages;
            
        }
        pages++;
        record.setId(id);
        record.clear();
        recordStore.ensureHeavy(record);
    }
    return pages;
}