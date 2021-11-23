public java.util.List<org.apache.hadoop.hive.metastore.api.SFileLocation> getSFileLocations(long fid) throws org.apache.hadoop.hive.metastore.api.MetaException {
    boolean commited = false;
    java.util.List<org.apache.hadoop.hive.metastore.api.SFileLocation> sfl = new java.util.ArrayList<org.apache.hadoop.hive.metastore.api.SFileLocation>();
    try {
        openTransaction();
        currentTransaction.setIsolationLevel("repeatable-read");
        sfl = convertToSFileLocation(getMFileLocations(fid));
        commited = commitTransaction();
        currentTransaction.setIsolationLevel("read-committed");
    } finally {
        if (!commited) {
            rollbackTransaction();
        }
    }
    return sfl;
}